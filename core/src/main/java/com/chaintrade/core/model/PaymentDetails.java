package com.chaintrade.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentDetails {

    private final String name;
    private final String cardNumber;
    private final int validUntilMonth;
    private final int validUntilYear;
    private final String cvv;
}
