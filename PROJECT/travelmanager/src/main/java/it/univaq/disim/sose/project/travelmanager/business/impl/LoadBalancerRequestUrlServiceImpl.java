package it.univaq.disim.sose.project.travelmanager.business.impl;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Service;

import it.univaq.disim.sose.project.client.loadbalancer.LoadBalancer;
import it.univaq.disim.sose.project.client.loadbalancer.LoadBalancerService;
import it.univaq.disim.sose.project.client.loadbalancer.Request;
import it.univaq.disim.sose.project.travelmanager.business.LoadBalancerRequestUrlService;

@Service
public class LoadBalancerRequestUrlServiceImpl implements LoadBalancerRequestUrlService {
	
	@Override
	public URL getUrlService() {
		URL u = null;
		try {
			LoadBalancerService LBservice = new LoadBalancerService();
			LoadBalancer LBurl = LBservice.getLoadBalancerPort();
			
			Request req = new Request();
					req.setService("PlacesOfCity");
									
			String url = LBurl.requestUrl(req).getUrl();
			u = new URL(url);
			
			System.out.println("### LOAD BALANCER RESPONSE URL: "+url);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
		
	}
	
}
