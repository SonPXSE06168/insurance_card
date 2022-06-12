package com.swp.insurancecard.models;

import lombok.Data;

@Data
public class RequestCompensation {
    int id;
    int accidentId;
    String status;
    long amount;
    String requestTime;
    String resolveTime;
}
