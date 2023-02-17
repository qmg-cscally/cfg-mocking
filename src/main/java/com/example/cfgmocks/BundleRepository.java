package com.example.cfgmocks;

import com.example.cfgmocks.exception.BundleNotFoundException;
import com.example.cfgmocks.models.Bundle;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import static com.example.cfgmocks.BundleGenerator.bundle;

@Component
public class BundleRepository {

    private static final Map<String, Bundle> FAKE_DATABASE = new HashMap<>() {{
        put("bundleid1", bundle("bundleid1", "enqid1", "1"));
        put("bundleid2", bundle("bundleid2", "enqid2", "1"));
        put("bundleid3", bundle("bundleid3", "enqid3", "1"));
    }};

    public Bundle getBundle(String id) throws BundleNotFoundException {
        Bundle bundle = FAKE_DATABASE.get(id);

        if(null == bundle) {
            throw new BundleNotFoundException("No Enquiry found for the provided id");
        } else {
            return bundle;
        }
    }

    public Bundle getBundleByEnquiryId(String enquiryId) throws BundleNotFoundException {
        try {
            String relevantKey = FAKE_DATABASE.keySet().stream()
                    .filter(it -> FAKE_DATABASE.get(it).getEnquiryId() == enquiryId)
                    .findFirst().orElseThrow();

            return FAKE_DATABASE.get(relevantKey);
        } catch (NoSuchElementException ex) {
            throw new BundleNotFoundException("no bundle found");
        }
    }

}
