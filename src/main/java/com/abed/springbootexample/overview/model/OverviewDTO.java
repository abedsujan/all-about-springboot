package com.abed.springbootexample.overview.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Getter;

import java.io.Serial;
import java.util.List;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = OverviewDTO.OverviewDTOBuilder.class)
public class OverviewDTO {
    @Serial
    private static final long serialVersionUID = 5845784954857348545L;

    private final String clientName;
    private final Double totalValue;
    private final Double profit;
    private final Double loss;
    private final String currency;
    private final List<Account> accounts;

    @JsonPOJOBuilder(withPrefix = "")
    public static final class OverviewDTOBuilder{
        public OverviewDTOBuilder(){
            // construct required by java
        }
    }

}
