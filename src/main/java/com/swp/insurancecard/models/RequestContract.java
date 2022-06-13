package com.swp.insurancecard.models;

import lombok.Data;

@Data
public class RequestContract {
    Integer id;
    String type;
    Integer contractID;
    String requestTime;
    String status;
    String resolveTime;
}
