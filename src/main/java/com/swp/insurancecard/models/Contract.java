package com.swp.insurancecard.models;

import lombok.Data;

@Data
public class Contract {
    int contractID;
    int userID;
    String method;
    long amount;
    String time;
}
