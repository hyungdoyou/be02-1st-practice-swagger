package com.example.springdoc.controller;

import com.example.springdoc.model.MemberSignupReq;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "상품 컨트롤러 v1", tags = "상품 API")
@RequestMapping("/product")
public class ProductController {
    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public ResponseEntity list() {
        return ResponseEntity.ok().body("product list");
    }
}
