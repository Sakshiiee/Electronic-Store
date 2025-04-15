package com.lcwd.electronic.store.dtos;

import lombok.*;

import java.util.UUID;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    private String userID;

    private String name;


    private String email;


    private String password;


    private String gender;

    private String about;

    private String imageName;
}
