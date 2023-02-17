package com.example.cfgmocks.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Enquiry {

    private String id;
    private List<SuccessfulQuote> quotes;
    private Boolean priceReuse;

}
