package com.example.cfgmocks;

import com.example.cfgmocks.exception.BundleNotFoundException;
import com.example.cfgmocks.models.Bundle;
import com.example.cfgmocks.models.CreateBundleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateBundleFromExistingBundle {

    private final BundleRepository bundleRepository;

    @Autowired
    public CreateBundleFromExistingBundle(BundleRepository bundleRepository) {
        this.bundleRepository = bundleRepository;
    }

    public Bundle create(CreateBundleRequest createBundleRequest) throws BundleNotFoundException {
        return bundleRepository.getBundleByEnquiryId(createBundleRequest.getEnquiryId());
    }
}
