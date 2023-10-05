package ${package}.business;

public interface CommentService<T,S> {	
	
	/* Richieste al servizio placesofcity */
	
	T addComment(int activity,String key, String title, String comment) throws BusinessException;
	
	S getComment(int activity) throws BusinessException;	
	
} 
