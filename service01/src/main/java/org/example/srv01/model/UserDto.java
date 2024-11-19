package org.example.srv01.model;

import lombok.Data;
import org.apache.tomcat.jni.Address;

@Data
public class UserDto {
    private Long age;
    private String name;
    private Address address;
}