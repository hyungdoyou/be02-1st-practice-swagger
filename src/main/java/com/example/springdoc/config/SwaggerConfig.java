package com.example.springdoc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2 // Swagger2를 사용하겠다
public class SwaggerConfig  {

    @Bean
    public Docket newsApiAll() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("00. All Device API REST Service")
                .apiInfo(apiInfo())
                .select()
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket newsApiAccelerator() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("01. Accelerator Guide Program Service")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/acl.*"))
                .build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("test")  // select definition 오른쪽 상단위 출력 표시
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.springdoc"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot Test")
                .description("스프링 부트 테스트")
                .version("2.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
                .contact(new Contact("블로그 주소", "https://velog.io/@passion_hd", "yhd4286@naver.com"))
                .build();
    }
}
