package it.univaq.sose.project.multipleclients.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;


import it.univaq.sose.project.multipleclients.business.MultipleClientsService;
import it.univaq.sose.project.multipleclients.model.ResultRequest;




@Controller("controller_multipleclients")
public class RESTMultipleClients {
	
	@Value("#{cfg.RequestServiceDebug}")
	private Boolean DEBUG; 
	

	@Autowired
	private MultipleClientsService service;


	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/{number}")

	public List<ResultRequest> REST_getMultipleClientsService(@PathParam("number")int number){
		
		return service.startRequest(number);
		
	}	
	

	
}
