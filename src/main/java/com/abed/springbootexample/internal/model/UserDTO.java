package com.abed.springbootexample.internal.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -5845784954857348545L;

    private final String name;
    private final String id;
    private final String type;

    @JsonPOJOBuilder(withPrefix = "")
    public static final class UserDTOBuilder {
        public UserDTOBuilder() {
            // construct required by java
        }
    }

}
