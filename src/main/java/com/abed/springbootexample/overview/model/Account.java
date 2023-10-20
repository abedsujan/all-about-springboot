package com.abed.springbootexample.overview.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Account {
    private final String name;
    private final String number;
    private Double balance;
    private boolean active;

}
