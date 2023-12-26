package com.example.springdoc.model;


import io.swagger.annotations.ApiParam;
import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberLoginReq {

    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$")
    @ApiParam(value = "회원의 이메일을 입력", required = true, example = "test01@naver.com")
    private String email;

    @NotNull
    @Max(10)
    @ApiParam(value = "회원의 패스워드를 입력", required = true, example = "qwer1234")
    private String password;
}
