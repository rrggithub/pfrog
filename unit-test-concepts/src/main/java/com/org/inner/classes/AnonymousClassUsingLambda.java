package com.org.inner.classes;

import org.springframework.jdbc.core.RowMapper;

public class AnonymousClassUsingLambda {

    private static RowMapper ROW_MAPPER = (rs, row)->{
        return "Hello";
    };
}
