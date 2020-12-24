package com.example;


import io.micronaut.http.annotation.Get;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Parameter(name = "page", in = ParameterIn.QUERY)
@Parameter(name = "pageSize", in = ParameterIn.QUERY)
public @interface PageParam {

}

