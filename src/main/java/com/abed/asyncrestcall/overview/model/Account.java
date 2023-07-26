package com.abed.asyncrestcall.overview.model;


import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Account {
    private final String name;
    private final String number;
    private Double balance;
    private boolean active;

}
