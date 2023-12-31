package com.abed.springbootexample.overview.model;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Builder
@Getter
@Jacksonized
public class StatusDTO {
    Status status;
}
