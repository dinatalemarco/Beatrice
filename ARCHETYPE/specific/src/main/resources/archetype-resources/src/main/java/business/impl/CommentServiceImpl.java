package ${package}.business.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ${package}.business.BusinessException;
import ${package}.business.CommentService;
import ${package}.business.LoadBalancerRequestUrlService;
import ${package}.client.placesofcity.AddCommentResponse;
import ${package}.client.placesofcity.GetCommentResponse;



@Service
public class CommentServiceImpl implements CommentService<AddCommentResponse,GetCommentResponse> {
		
	@Autowired
	private LoadBalancerRequestUrlService UrlService;


	@Override
	public AddCommentResponse addComment(int activity, String key, String title, String text) throws BusinessException {
		
		AddCommentResponse x = new AddCommentResponse();

		return x;
		
	}	
	
	
	@Override
	public GetCommentResponse getComment(int activity) throws BusinessException {
		
		GetCommentResponse x = new GetCommentResponse();

		return x;
		
	}	
				
	

}
