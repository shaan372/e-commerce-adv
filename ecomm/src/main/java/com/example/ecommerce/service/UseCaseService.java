package com.example.ecommerce.service;

import com.example.ecommerce.dto.request.UseCaseRequest;
import com.example.ecommerce.entity.UseCase;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface UseCaseService {
	List<UseCase> findUseCaseByProductId(Integer productId);

	List<UseCase> findAllUseCasesByIds(List<Integer> ids);

	List<UseCase> saveAllUseCases(List<UseCaseRequest> useCaseRequests);
}
