package com.example.cfgmocks;

import com.example.cfgmocks.exception.EnquiryNotFoundException;
import com.example.cfgmocks.models.Bundle;
import com.example.cfgmocks.models.CreateBundleRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CreateBundleOrchestratorTest {

    @Mock
    CreateBundleFromExistingBundle mockCreateBundleFromExistingBundle;

    @Mock
    CreateNewBundle mockCreateNewBundle;

    @Mock
    EnquiryRepository mockEnquiryRepository;

    @InjectMocks
    CreateBundleOrchestrator createBundleOrchestrator;

    private CreateBundleRequest createBundleRequest = CreateBundleRequest.builder()
            .enquiryId("enqid1")
            .formVersion("1")
            .build();

    // write a test for when the transaction source is not backoffice
    @Test
    void createNewBundleWhenTransactionSourceIsNotBackoffice() throws EnquiryNotFoundException {

        Mockito.when(mockCreateNewBundle.create(createBundleRequest)).thenReturn(
                Bundle.builder().id("bundleId1").formVersion("1").build()
        );

        Bundle bundle = createBundleOrchestrator
                .orchestrateBundleCreation("whatever", createBundleRequest);

        Assertions.assertEquals(bundle.getId(), "bundleId1");
    }

    // write a test for when
    // the transaction source is backoffice
    // the request relates to an enquiry where price reuse is false
    @Test
    void test() {

    }

    // write a test for when
    // the transaction source is backoffice
    // the request relates to an enquiry where price reuse is true
    // the request relates to a bundle which does not exist
    @Test
    void test2() {

    }

    // write a test for when
    // the transaction source is backoffice
    // the request relates to an enquiry where price reuse is true
    // the request relates to a bundle which does exist
    @Test
    void test3() {

    }

}