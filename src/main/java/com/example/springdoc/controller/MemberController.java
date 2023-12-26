package com.example.springdoc.controller;

import com.example.springdoc.model.MemberLoginReq;
import com.example.springdoc.model.MemberSignupReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@RestController
@Api(value = "회원 컨트롤러 v1", tags = "회원 API")
@RequestMapping("/member")
public class MemberController {

    @ApiOperation("로그인")
    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public ResponseEntity login(@Valid MemberLoginReq memberLoginReq) {
        return ResponseEntity.ok().body("login process");
    }

    @ApiOperation("회원가입")
    @RequestMapping(method = RequestMethod.POST, value = "/signup")
    public ResponseEntity signup(@Valid MemberSignupReq memberSignupReq) {
        return ResponseEntity.ok().body("signup process");
    }
}
