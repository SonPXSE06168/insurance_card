package com.swp.insurancecard.models;

import lombok.Data;

@Data
public class Punishment {
    int contractID;
    long amount;
    String status;
    String resolveTime;
}
