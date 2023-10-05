package it.univaq.disim.sose.project.placesofcity.business;

import java.util.List;

public interface LikeService<T,S> {

	public T addLike(int id_activity, String token_user) throws BusinessException;
	
	public List<S> getLikeByUser(String token_user) throws BusinessException;	
	
}
