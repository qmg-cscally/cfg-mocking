package com.example.cfgmocks.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SuccessfulQuote {

    private String id;
    private String quoteReference;
    private ProductData productData;
    private QuotedPremium quotedPremium;
    private List<ProductCode> eligibleProductCodes;

}
