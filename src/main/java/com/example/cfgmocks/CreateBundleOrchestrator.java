package com.example.cfgmocks;

import com.example.cfgmocks.exception.BundleNotFoundException;
import com.example.cfgmocks.exception.EnquiryNotFoundException;
import com.example.cfgmocks.models.Bundle;
import com.example.cfgmocks.models.CreateBundleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CreateBundleOrchestrator {

    private final CreateNewBundle createNewBundle;
    private final CreateBundleFromExistingBundle createBundleFromExistingBundle;
    private final EnquiryRepository enquiryRepository;

    @Autowired
    public CreateBundleOrchestrator(
            CreateNewBundle createNewBundle,
            CreateBundleFromExistingBundle createBundleFromExistingBundle,
            EnquiryRepository enquiryRepository
    ) {
        this.createNewBundle = createNewBundle;
        this.createBundleFromExistingBundle = createBundleFromExistingBundle;
        this.enquiryRepository = enquiryRepository;
    }

    public Bundle orchestrateBundleCreation(final String transactionSource, final CreateBundleRequest createBundleRequest) throws EnquiryNotFoundException {
        if (!Objects.equals(transactionSource, "backoffice") || !priceReuse(createBundleRequest)) {
            return createNewBundle.create(createBundleRequest);
        } else {
            try {
                return createBundleFromExistingBundle.create(createBundleRequest);
            } catch (BundleNotFoundException ex) {
                return createNewBundle.create(createBundleRequest);
            }
        }

    }

    private Boolean priceReuse(final CreateBundleRequest request) throws EnquiryNotFoundException {
        return enquiryRepository.getEnquiry(request.getEnquiryId()).getPriceReuse();
    }

}
