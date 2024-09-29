package com.example.ecommerce.service.jpa;

import com.example.ecommerce.dto.request.UseCaseRequest;
import com.example.ecommerce.entity.UseCase;
import com.example.ecommerce.repository.jpa.UseCaseRepository;
import com.example.ecommerce.service.UseCaseService;
import java.util.List;
import java.util.stream.StreamSupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class UseCaseServiceV1 implements UseCaseService {

	@Autowired private UseCaseRepository useCaseRepository;

	@Override
	public List<UseCase> findUseCaseByProductId(Integer productId) {
		List<UseCase> useCases = useCaseRepository.findUseCaseByProduct(productId);
		return useCases;
	}

	@Override
	public List<UseCase> findAllUseCasesByIds(List<Integer> ids) {
		List<UseCase> useCases =
				StreamSupport.stream(useCaseRepository.findAllById(ids).spliterator(), false)
						.toList();
		return useCases;
	}

	@Override
	public List<UseCase> saveAllUseCases(List<UseCaseRequest> useCaseRequests) {
		List<UseCase> useCases =
				useCaseRequests.stream()
						.map(
								(useCaseRequest -> {
									UseCase useCase = new UseCase();
									useCase.setDescription(useCaseRequest.getDescription());
									return useCase;
								}))
						.toList();
		List<UseCase> useCaseList =
				StreamSupport.stream(useCaseRepository.saveAll(useCases).spliterator(), false)
						.toList();
		return useCaseList;
	}
}
