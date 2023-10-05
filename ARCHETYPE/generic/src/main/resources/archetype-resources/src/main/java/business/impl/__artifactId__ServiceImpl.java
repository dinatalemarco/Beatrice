package ${package}.business.impl;

import org.springframework.stereotype.Service;

import ${package}.business.BusinessException;
import ${package}.business.${artifactId}Service;



@Service
public class ${artifactId}ServiceImpl implements ${artifactId}Service<String> {

	
	@Override
	public String Sample(String param) throws BusinessException {

		return param;
		
	}	
	
	
}
