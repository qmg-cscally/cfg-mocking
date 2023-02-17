package com.example.cfgmocks.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bundle {

    private String id;
    private String enquiryId;
    private String formVersion;

}
