package com.swp.insurancecard.models;

import lombok.Data;

@Data
public class PaymentHistory {
    Integer id;
    String method;
    long amount;
    String paymentTime;
    Integer contractID;
}
