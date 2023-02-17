package com.example.cfgmocks.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductData {
    private ProductCode productCode;
    private BusinessLineId businessLineId;
}
