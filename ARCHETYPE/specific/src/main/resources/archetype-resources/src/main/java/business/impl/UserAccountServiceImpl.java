package ${package}.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${package}.client.placesofcity.LoginResponse;
import ${package}.client.placesofcity.RegisterResponse;
import ${package}.business.BusinessException;
import ${package}.business.LoadBalancerRequestUrlService;
import ${package}.business.UserAccountService;


@Service
public class UserAccountServiceImpl implements UserAccountService<RegisterResponse,LoginResponse> {

	@Autowired
	private LoadBalancerRequestUrlService UrlService;
	
	@Override
	public RegisterResponse register(String name,String surname,String email,String password) throws BusinessException {
		
		RegisterResponse x = new RegisterResponse();

		return x;
		
	}	
	
	
	@Override
	public LoginResponse login(String email,String password) throws BusinessException {
		
		LoginResponse x = new LoginResponse();

		return x;
		
	}				
	
	
}
