package it.univaq.disim.sose.project.loadbalancer.business.impl;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;
import it.univaq.disim.sose.project.loadbalancer.business.BusinessException;
import it.univaq.disim.sose.project.loadbalancer.business.LoadBalancerService;
import it.univaq.disim.sose.project.loadbalancer.model.Context;
import it.univaq.disim.sose.project.loadbalancer.model.ServerObject;


@Service
public class LoadBalancerServiceImpl implements LoadBalancerService {
	
	
	private static AtomicInteger index = new AtomicInteger(0);
	

	public String getUrl(String service) throws BusinessException {
		
		/* Definisco una lista di server con cui lavorerò */
		List<ServerObject> servers = new ArrayList<ServerObject>();
		servers.add(new ServerObject("http://localhost:8080/placesofcity/services/placesofcity?wsdl", 5, 5)); // accetta 5 connessioni in un lasso di tempo di 5  secondi
		servers.add(new ServerObject("http://localhost:8081/placesofcity/services/placesofcity?wsdl", 1, 5)); // accetta 1 connessioni in un lasso di tempo di 5  secondi
		servers.add(new ServerObject("http://localhost:8082/placesofcity/services/placesofcity?wsdl", 20, 5)); // accetta 20 connessioni in un lasso di tempo di 5  secondi
		
		/* Inserisco la lista di server in memoria così da poter aggiornare lo stato di ogniuno di essi */
		Context context = new Context(servers);
		
		/* Estraggo le informazioni da contesto così da poterci lavorare */
		servers = context.getServers();
		
		while(true) {
			
			/* Voglio gestire la politica di scheduling tramite round robin */
			int i = index.getAndAccumulate(servers.size(), (current, n)->current >= n-1 ? 0 : current+1);
			
			/* Rimuovo le vecchie connessioni */			
			/* Verifico che la prima connessioneistaurata con il server sia ancora nel range di valutazione,
			   nel caso sia fuori da tale range elimino la richiesta  */
			for(int t =0; t < servers.get(i).getContConnections(); t++){
				if(servers.get(i).getRequestsOverTime() > servers.get(i).getUnitUnitsOfTime()) {
					servers.get(i).removeConnectionIn(0); /* Prima richiesta nello stack */
				}
			}			
			
			
			/* Verificato che tutte le connessione aperto sono dentro il range e verifico la possibilità di aprirne una nuova */
			if(servers.get(i).getContConnections() < servers.get(i).getMaxConnections()) {
				/* Posso aprire la connessione con il server */

				servers.get(i).setConnectionIn(new Date());
				
				/* Aggiorno lo stato del server i-esimo */
				context.Update(servers);
				
				/* Restituisco la porta di connessione del server */
				return servers.get(i).getUrl();
			}	
			
		}
		
	
	}	

	
}
