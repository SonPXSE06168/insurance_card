package com.swp.insurancecard.models;

import lombok.Data;

@Data
public class PaymentHistory {
    int id;
    String method;
    long amount;
    String paymentTime;
    int contractID;
}
