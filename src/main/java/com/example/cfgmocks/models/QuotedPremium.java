package com.example.cfgmocks.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuotedPremium {
    private Integer grossAmount;
    private Integer netAmount;
}
