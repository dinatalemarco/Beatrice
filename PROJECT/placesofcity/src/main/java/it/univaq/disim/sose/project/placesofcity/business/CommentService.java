package it.univaq.disim.sose.project.placesofcity.business;

import java.util.List;


public interface CommentService<T,S> {
	
	T addComment(int id_activity, String key, String title, String comment) throws BusinessException;
	
	List<S> getComments(int id_activity) throws BusinessException;	

}
