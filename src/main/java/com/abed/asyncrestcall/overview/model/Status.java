package com.abed.asyncrestcall.overview.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
    ONGOING,
    READY,
    FAILED;

    @JsonValue
    public String getStatus(){
        return this.name();
    }
}
