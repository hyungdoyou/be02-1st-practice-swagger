package com.example.springdoc.model;


import io.swagger.annotations.ApiParam;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberLoginReq {

//    @Email  //(validation 라이브러리에 있는 골뱅이가 들어가는 형식)
//    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$") // 정규표현식 검색해서 적어줌
    @ApiParam(value = "회원의 이메일을 입력", required = true, example = "test01@naver.com")
    private String email;

    @NotNull
    @Min(10)
    @ApiParam(value = "회원의 패스워드를 입력", required = true)
    private String password;
}
