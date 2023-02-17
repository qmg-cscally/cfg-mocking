package com.example.cfgmocks;

import com.example.cfgmocks.models.Bundle;
import com.example.cfgmocks.models.CreateBundleRequest;
import org.springframework.stereotype.Component;

@Component
public class CreateNewBundle {

    public Bundle create(final CreateBundleRequest request) {
        return Bundle.builder()
                .id("testid")
                .enquiryId(request.getEnquiryId())
                .formVersion(request.getFormVersion())
                .build();
    }

}
