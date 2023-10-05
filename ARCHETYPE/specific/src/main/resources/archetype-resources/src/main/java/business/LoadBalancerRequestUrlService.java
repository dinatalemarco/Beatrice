package ${package}.business;

import java.net.URL;

public interface LoadBalancerRequestUrlService {
	
	URL getUrlService() throws BusinessException;

}
