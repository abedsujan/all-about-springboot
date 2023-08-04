package com.abed.asyncrestcall.common.generic_store;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class GenericStoreRawKey {
    private final String customerId;
    private final Operation operation;
    private final String rawKey;

    @Builder
    private GenericStoreRawKey(final String customerId,
                               final Operation operation) {
        this.customerId = customerId;
        this.operation = operation;
        this.rawKey = customerId + '-' + operation.name();
    }

    public enum Operation {
        CUSTOMER_PERFORMANCE,
        CUSTOMER_OVERVIEW
    }

}
