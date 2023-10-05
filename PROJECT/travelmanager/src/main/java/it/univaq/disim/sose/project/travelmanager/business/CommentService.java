package it.univaq.disim.sose.project.travelmanager.business;

public interface CommentService<T,S> {	
	
	/* Richieste al servizio placesofcity */
	
	T addComment(int activityId,String userKey, String title, String comment) throws BusinessException;
	
	S getComment(int activityId) throws BusinessException;	
	
} 
