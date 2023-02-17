package com.example.cfgmocks.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateBundleRequest {

    private String enquiryId;
    private String formVersion;

}
