package com.example.cfgmocks;

import com.example.cfgmocks.exception.EnquiryNotFoundException;
import com.example.cfgmocks.models.Enquiry;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.cfgmocks.EnquiryGenerator.*;

@Component
public class EnquiryRepository {

    private static final Map<String, Enquiry> FAKE_DATABASE = new HashMap<>() {{
        put("enqid1", enquiryQuoted("id1", List.of(qgl10Quote()), true));
        put("enqid2", enquiryQuoted("id2", List.of(qgl14Quote()), false));
        put("enqid3", enquiryQuoted("id3", List.of(qgl11Quote()), false));
        put("enqid4", enquiryQuoted("id4", List.of(qgl10Quote(), homeLegalSelectFree()), true));
        put("enqid5", enquiryQuoted("id5", List.of(qgl14Quote(), homeEmergencySelectPaidQuote(), homeLegalSelectPaid()), false));
        put("enqid6", enquiryQuoted("id6", List.of(qgl11Quote(), homeLegalSelectFree(), oneKey()), true));
    }};

    public Enquiry getEnquiry(String id) throws EnquiryNotFoundException {
        Enquiry enquiry = FAKE_DATABASE.get(id);

        if(null == enquiry) {
            throw new EnquiryNotFoundException("No Enquiry found for the provided id");
        } else {
            return enquiry;
        }
    }

}
