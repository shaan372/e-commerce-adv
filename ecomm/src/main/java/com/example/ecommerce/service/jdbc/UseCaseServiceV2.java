package com.example.ecommerce.service.jdbc;

import com.example.ecommerce.dto.request.UseCaseRequest;
import com.example.ecommerce.entity.UseCase;
import com.example.ecommerce.service.UseCaseService;
import java.util.List;

public class UseCaseServiceV2 implements UseCaseService {
	@Override
	public List<UseCase> findUseCaseByProductId(Integer productId) {
		return null;
	}

	@Override
	public List<UseCase> findAllUseCasesByIds(List<Integer> ids) {
		return null;
	}

	@Override
	public List<UseCase> saveAllUseCases(List<UseCaseRequest> useCaseRequests) {
		return null;
	}
}
