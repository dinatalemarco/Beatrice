package it.univaq.disim.sose.project.placesofcity.business;


public interface AccountUserService<T,S> {

	T newUser(String name,String surname,String email, String password) throws BusinessException;
	
	S getSession(String email, String password) throws BusinessException;	
	
}
