package com.org.inner.classes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PrivateInnerClassTest {

    @Test
    public void testSomeInnerMethod() throws Exception{
        PrivateInnerClass privateInnerClass = new PrivateInnerClass();
        Class clz = PrivateInnerClass.class.getDeclaredClasses()[0];
        Arrays.stream(clz.getDeclaredConstructors()).forEach(System.out::println);
        Constructor constructor = clz.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        Object obj = constructor.newInstance(privateInnerClass);
        Method method = obj.getClass().getDeclaredMethod("someInnerMethod");
        method.setAccessible(true);
        Assert.assertEquals("Hello", method.invoke(obj));
    }

}