package com.chaintrade.orderservice.core.event;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderCancelledEvent {
    private String orderId;
    private String reason;
} 