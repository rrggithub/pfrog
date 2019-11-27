package com.org.inner.classes;

import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.util.Arrays;


public class AnonymousClassUsingLambdaTest {

    @Test
    public void testRowMapperLambdaFn() throws Exception{
        AnonymousClassUsingLambda anonymousClassUsingLambda = new AnonymousClassUsingLambda();
        ResultSet resultSet = Mockito.mock(ResultSet.class);
        //System.out.println(anonymousClassUsingLambda.ROW_MAPPER.mapRow(resultSet,1));

        Field field = anonymousClassUsingLambda.getClass().getDeclaredField("ROW_MAPPER");
        field.setAccessible(true);

        Arrays.stream(anonymousClassUsingLambda.getClass().getDeclaredMethods()).forEach(System.out::println);

        Method method = anonymousClassUsingLambda.getClass().getDeclaredMethod("lambda$static$0",ResultSet.class,int.class);
        method.setAccessible(true);
        System.out.println(method.invoke(anonymousClassUsingLambda,resultSet,1));
    }
}