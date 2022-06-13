package com.swp.insurancecard.models;

import lombok.Data;

@Data
public class Accident {
    Integer id;
    Integer contractID;
    String detail;
    String occurTime;
    String status;
    String resolveTime;
}
