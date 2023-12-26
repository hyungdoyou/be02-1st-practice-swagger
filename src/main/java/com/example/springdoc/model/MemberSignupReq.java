package com.example.springdoc.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberSignupReq {
    private String email;
    private String password;
    private String name;
}
