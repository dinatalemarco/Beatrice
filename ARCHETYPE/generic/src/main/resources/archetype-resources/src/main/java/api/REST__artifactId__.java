package ${package}.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;


import ${package}.business.${artifactId}Service;




@Controller("controller_${artifactId}")
public class REST${artifactId} {

	private static Logger LOGGER = LoggerFactory.getLogger(REST${artifactId}.class);
	
	@Value("#{cfg.RequestServiceDebug}")
	private Boolean DEBUG; 
	

	@Autowired
	private ${artifactId}Service<String> service;


	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/{string}")

	public String REST_get${artifactId}Service(@PathParam("string") String param){
		
		if(DEBUG) LOGGER.info("REST USER REQUEST (REST_get${artifactId}Service) :" +param);
		
		return service.Sample(param);
	}	
	

	
}
