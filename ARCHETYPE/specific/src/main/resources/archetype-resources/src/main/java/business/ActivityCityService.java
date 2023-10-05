package ${package}.business;


public interface ActivityCityService<T> {

	T ActivityList(String city) throws BusinessException;
	
	T ActivityListProfile(String city, String profile) throws BusinessException;	
	
}
