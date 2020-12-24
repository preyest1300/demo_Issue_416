package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;


@Controller("/")
public class HelloController {


    @Get(uri="/test", produces= MediaType.TEXT_PLAIN)
    public String test(String page, String pageSize) {
        return "test";
    }
}