package com.swp.insurancecard.models;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class User {
    Integer id;
    int gender;
    @Min(value = 10, message = "Số điện thoại 10 chữ số")
    String phoneNumber;
    @NotEmpty(message = "Địa chỉ cụ thể")
    String addressDetail;
    String district;
    String ward;
    String province;
}
