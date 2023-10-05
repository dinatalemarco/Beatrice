package it.univaq.disim.sose.project.travelmanager.business;


public interface LikeService<T,S> {

	T addlike(int id_activity, String key) throws BusinessException;	
	
	S getLikeByUser(String token_user) throws BusinessException;
	
}
