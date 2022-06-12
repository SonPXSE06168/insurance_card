package com.swp.insurancecard.models;

import lombok.Data;

@Data
public class Accident {
    int id;
    int contractID;
    String detail;
    String occurTime;
    String status;
    String resolveTime;
}
