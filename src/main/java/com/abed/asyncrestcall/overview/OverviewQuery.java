package com.abed.asyncrestcall.overview;

import com.abed.asyncrestcall.common.generic_store.GenericStoreRawKey;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder
@Getter
public class OverviewQuery {
    private final String customerId;
    private LocalDate dateToFilter;

    @Builder.Default
    private boolean userCache = true;

    public GenericStoreRawKey getRawKey() {
        return GenericStoreRawKey.builder()
                .customerId(customerId)
                .operation(GenericStoreRawKey.Operation.CUSTOMER_OVERVIEW)
                .build();
    }
}
