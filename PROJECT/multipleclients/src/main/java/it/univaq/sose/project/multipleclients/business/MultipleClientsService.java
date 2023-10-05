package it.univaq.sose.project.multipleclients.business;

import java.util.List;

import it.univaq.sose.project.multipleclients.model.ResultRequest;

public interface MultipleClientsService {

	List<ResultRequest> startRequest(int number) throws BusinessException;
}
