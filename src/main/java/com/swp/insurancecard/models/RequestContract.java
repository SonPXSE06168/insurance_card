package com.swp.insurancecard.models;

import lombok.Data;

@Data
public class RequestContract {
    int id;
    String type;
    int contractID;
    String requestTime;
    String status;
    String resolveTime;
}
