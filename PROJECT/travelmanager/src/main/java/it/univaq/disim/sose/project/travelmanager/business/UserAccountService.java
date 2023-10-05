package it.univaq.disim.sose.project.travelmanager.business;

public interface UserAccountService<T,S> {
	
	T register(String name,String surname,String email,String password) throws BusinessException;
	
	S login(String email,String password) throws BusinessException;	

}
