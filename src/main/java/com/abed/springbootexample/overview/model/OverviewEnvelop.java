package com.abed.springbootexample.overview.model;


import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;


/**
 *  Contains account holdings overview envelop. Status indicates whether caller needed to initiate an async request
 * to start process of collecting performace form downstream service (Status is NOT_STARTED)
 * Data will be cached for one day and when caller request different periods same data is reused
 */

@Builder
@Getter
@Jacksonized
public class OverviewEnvelop {
    private final StatusDTO status;
    private final OverviewDTO overview;
}
