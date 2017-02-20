package com.winsigns.investment.fundService.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.winsigns.investment.fundService.controller.FundController;
import com.winsigns.investment.fundService.model.Fund;

public class FundResourceAssembler extends ResourceAssemblerSupport<Fund, FundResource> {

	public FundResourceAssembler() {
		super(FundController.class, FundResource.class);
	}

	@Override
	public FundResource toResource(Fund fund) {
		FundResource resource = createResourceWithId(fund.getId(), fund);
		return resource;
	}

	@Override
	protected FundResource instantiateResource(Fund entity) {
		return new FundResource(entity);
	}

}