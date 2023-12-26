package com.example.springdoc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
//                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.example.springdoc")) // 내가 공개할 것만 지정
//                .apis(RequestHandlerSelectors.basePackage("com.example.springdoc.member")
//                        .or(RequestHandlerSelectors.basePackage("com.example.springdoc.product"))) // 내가 공개할 것만 지정
                .paths(PathSelectors.any())
                .build();
    }
}
