package com.example.cfgmocks;

import com.example.cfgmocks.models.*;

import java.util.List;

public class EnquiryGenerator {

    public static Enquiry enquiryQuoted(String id, List<SuccessfulQuote> quotes, Boolean priceReuse) {
        return Enquiry.builder()
                .id(id)
                .quotes(quotes)
                .priceReuse(priceReuse)
                .build();
    }

    public static SuccessfulQuote qgl14Quote(){
        return SuccessfulQuote.builder()
                .id("qgl14Quote")
                .quoteReference("qgl14Quote")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.qgl14)
                                .businessLineId(BusinessLineId.home)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(120)
                                .netAmount(100)
                                .build()
                )
                .eligibleProductCodes(
                        List.of(
                                ProductCode.home_emergency_plus,
                                ProductCode.home_emergency_select_paid,
                                ProductCode.home_legal_plus,
                                ProductCode.home_legal_select_paid,
                                ProductCode.key_cover_four_fob,
                                ProductCode.key_cover_three_fob,
                                ProductCode.key_cover_two_fob,
                                ProductCode.key_cover_one_fob
                        )
                )
                .build();
    }

    public static SuccessfulQuote qgl10Quote(){
        return SuccessfulQuote.builder()
                .id("qgl10Quote")
                .quoteReference("qgl10Quote")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.qgl10)
                                .businessLineId(BusinessLineId.home)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(140)
                                .netAmount(120)
                                .build()
                )
                .eligibleProductCodes(
                        List.of(
                                ProductCode.home_emergency_plus,
                                ProductCode.home_emergency_select_free,
                                ProductCode.home_legal_plus,
                                ProductCode.home_legal_select_free,
                                ProductCode.key_cover_four_fob,
                                ProductCode.key_cover_three_fob,
                                ProductCode.key_cover_two_fob,
                                ProductCode.key_cover_one_fob
                        )
                )
                .build();
    }

    public static SuccessfulQuote qgl11Quote(){
        return SuccessfulQuote.builder()
                .id("qgl11Quote")
                .quoteReference("qgl11Quote")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.qgl11)
                                .businessLineId(BusinessLineId.home)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(160)
                                .netAmount(140)
                                .build()
                )
                .eligibleProductCodes(
                        List.of(
                                ProductCode.home_emergency_plus,
                                ProductCode.home_emergency_select_free,
                                ProductCode.home_legal_plus,
                                ProductCode.home_legal_select_free,
                                ProductCode.key_cover_four_fob,
                                ProductCode.key_cover_three_fob,
                                ProductCode.key_cover_two_fob,
                                ProductCode.key_cover_one_fob
                        )
                )
                .build();
    }

    public static SuccessfulQuote homeEmergencySelectFreeQuote(){
        return SuccessfulQuote.builder()
                .id("homeEmergencySelectFreeQuote")
                .quoteReference("homeEmergencySelectFreeQuote")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.home_emergency_select_free)
                                .businessLineId(BusinessLineId.home_emergency)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(0)
                                .netAmount(0)
                                .build()
                )
                .eligibleProductCodes(
                        List.of()
                )
                .build();
    }

    public static SuccessfulQuote homeEmergencySelectPaidQuote(){
        return SuccessfulQuote.builder()
                .id("homeEmergencySelectPaidQuote")
                .quoteReference("homeEmergencySelectPaidQuote")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.home_emergency_select_paid)
                                .businessLineId(BusinessLineId.home_emergency)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(20)
                                .netAmount(10)
                                .build()
                )
                .eligibleProductCodes(
                        List.of()
                )
                .build();
    }

    public static SuccessfulQuote homeEmergencyPlusQuote(){
        return SuccessfulQuote.builder()
                .id("homeEmergencyPlusQuote")
                .quoteReference("homeEmergencyPlusQuote")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.home_emergency_plus)
                                .businessLineId(BusinessLineId.home_emergency)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(40)
                                .netAmount(30)
                                .build()
                )
                .eligibleProductCodes(
                        List.of()
                )
                .build();
    }

    public static SuccessfulQuote homeLegalSelectFree(){
        return SuccessfulQuote.builder()
                .id("homeLegalSelectFree")
                .quoteReference("homeLegalSelectFree")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.home_legal_select_free)
                                .businessLineId(BusinessLineId.home_legal)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(0)
                                .netAmount(0)
                                .build()
                )
                .eligibleProductCodes(
                        List.of()
                )
                .build();
    }

    public static SuccessfulQuote homeLegalSelectPaid(){
        return SuccessfulQuote.builder()
                .id("homeLegalSelectPaid")
                .quoteReference("homeLegalSelectPaid")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.home_legal_select_paid)
                                .businessLineId(BusinessLineId.home_legal)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(15)
                                .netAmount(5)
                                .build()
                )
                .eligibleProductCodes(
                        List.of()
                )
                .build();
    }

    public static SuccessfulQuote homeLegalPlus(){
        return SuccessfulQuote.builder()
                .id("homeLegalPlus")
                .quoteReference("homeLegalPlus")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.home_legal_plus)
                                .businessLineId(BusinessLineId.home_legal)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(25)
                                .netAmount(15)
                                .build()
                )
                .eligibleProductCodes(
                        List.of()
                )
                .build();
    }

    public static SuccessfulQuote oneKey(){
        return SuccessfulQuote.builder()
                .id("oneKey")
                .quoteReference("oneKey")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.key_cover_one_fob)
                                .businessLineId(BusinessLineId.key)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(10)
                                .netAmount(5)
                                .build()
                )
                .eligibleProductCodes(
                        List.of()
                )
                .build();
    }

    public static SuccessfulQuote fourKey(){
        return SuccessfulQuote.builder()
                .id("fourKey")
                .quoteReference("fourKey")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.key_cover_four_fob)
                                .businessLineId(BusinessLineId.key)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(40)
                                .netAmount(35)
                                .build()
                )
                .eligibleProductCodes(
                        List.of()
                )
                .build();
    }

    public static SuccessfulQuote twoKey(){
        return SuccessfulQuote.builder()
                .id("twoKey")
                .quoteReference("twoKey")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.key_cover_two_fob)
                                .businessLineId(BusinessLineId.key)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(20)
                                .netAmount(15)
                                .build()
                )
                .eligibleProductCodes(
                        List.of()
                )
                .build();
    }

    public static SuccessfulQuote threeKey(){
        return SuccessfulQuote.builder()
                .id("threeKey")
                .quoteReference("threeKey")
                .productData(
                        ProductData.builder()
                                .productCode(ProductCode.key_cover_three_fob)
                                .businessLineId(BusinessLineId.key)
                                .build()
                )
                .quotedPremium(
                        QuotedPremium.builder()
                                .grossAmount(30)
                                .netAmount(25)
                                .build()
                )
                .eligibleProductCodes(
                        List.of()
                )
                .build();
    }

}
