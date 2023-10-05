package ${package}.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ${package}.client.placesofcity.AddLikeResponse;
import ${package}.client.placesofcity.GetLikeResponse;
import ${package}.business.BusinessException;
import ${package}.business.LikeService;
import ${package}.business.LoadBalancerRequestUrlService;


@Service
public class LikeServiceImpl implements LikeService<AddLikeResponse,GetLikeResponse> {

	@Autowired
	private LoadBalancerRequestUrlService UrlService;
	
	@Override
	public AddLikeResponse addlike(int id_activity, String key) throws BusinessException {

		AddLikeResponse x = new AddLikeResponse();

		return x;
		
	}	
	
	
	@Override
	public GetLikeResponse getLikeByUser(String token_user) throws BusinessException {
		
		GetLikeResponse x = new GetLikeResponse();

		return x;
		
	}	
	
	
	
}
