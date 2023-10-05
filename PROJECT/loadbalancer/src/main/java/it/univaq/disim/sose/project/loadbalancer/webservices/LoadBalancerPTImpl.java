package it.univaq.disim.sose.project.loadbalancer.webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import it.univaq.disim.sose.project.loadbalancer.LoadBalancer;
import it.univaq.disim.sose.project.loadbalancer.Request;
import it.univaq.disim.sose.project.loadbalancer.Response;
import it.univaq.disim.sose.project.loadbalancer.business.LoadBalancerService;



@Component(value = "LoadBalancerPTImpl")
public class LoadBalancerPTImpl implements LoadBalancer {

	private static Logger LOGGER = LoggerFactory.getLogger(LoadBalancerPTImpl.class);
	@Value("#{cfg.WebServiceDebug}")
	private Boolean DEBUG; 
	
	@Autowired
	private LoadBalancerService service;

	
	public Response requestUrl(Request parameters) {

		try {

			String url = service.getUrl(parameters.getService());
	
			
			Response response = new Response();
			response.setUrl(url);
			
			if(DEBUG) LOGGER.info("Restituted Door: "+url);

			return response;
		} 
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}

	}	

	
}
