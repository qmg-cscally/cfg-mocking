package com.example.cfgmocks;

import com.example.cfgmocks.models.Bundle;

public class BundleGenerator {

    public static Bundle bundle(final String id, final String enquiryId, final String formVersion) {
        return Bundle.builder()
                .id(id)
                .enquiryId(enquiryId)
                .formVersion(formVersion)
                .build();
    }

}
