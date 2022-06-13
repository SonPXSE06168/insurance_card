package com.swp.insurancecard.models;

import lombok.Data;

@Data
public class Contract {
    Integer contractID;
    Integer userID;
    String method;
    long amount;
    String time;
}
