package ${package}.business.impl;

import org.springframework.stereotype.Service;

import ${package}.business.ActivityCityService;
import ${package}.business.BusinessException;
import ${package}.model.ActivityCollectionResult;



@Service
public class ActivityCityServiceImpl implements ActivityCityService<ActivityCollectionResult> {
	
	
	@Override
	public ActivityCollectionResult ActivityList(String city) throws BusinessException{
		
		ActivityCollectionResult x = new ActivityCollectionResult();
			
		return x;
		
	}
	
	@Override
	public ActivityCollectionResult ActivityListProfile(String city, String profile) throws BusinessException{

		ActivityCollectionResult x = new ActivityCollectionResult();
			
		return x;
		
	}	
	
	
}
