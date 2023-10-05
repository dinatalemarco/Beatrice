package it.univaq.disim.sose.project.loadbalancer.business;

public interface LoadBalancerService {

	String getUrl(String service) throws BusinessException;
	
}
