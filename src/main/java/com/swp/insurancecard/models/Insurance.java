package com.swp.insurancecard.models;

import lombok.Data;

@Data
public class Insurance {
    int id;
    long price;
    String type;
    double duration;
    String detail;
}
