package com.swp.insurancecard.models;

import lombok.Data;

@Data
public class RequestCompensation {
    Integer id;
    int accidentId;
    String status;
    long amount;
    String requestTime;
    String resolveTime;
}
