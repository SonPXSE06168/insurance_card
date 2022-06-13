package com.swp.insurancecard.models;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class Account {
    Integer id;

    @Email(message = "Email không hợp lệ")
    String email;

    @NotEmpty(message = "Không để trống")
    @Min(value = 8, message = "Ít nhất 8 ký tự")
    String password;

    @NotEmpty(message = "Không để trống")
    String firstName;

    String middleName;

    @NotEmpty(message = "Không để trống")
    String lastName;

    @NotEmpty
    String role;
}
