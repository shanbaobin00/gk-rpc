package com.eric.gkrpc.common.util;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ReflectionUtilTest {

    @Test
    public void newInstance() {
        TestClass testClass = ReflectionUtil.newInstance(TestClass.class);
        assertNotNull(testClass);
    }

    @Test
    public void getPublicMethods() {
        Method[] publicMethods = ReflectionUtil.getPublicMethods(TestClass.class);
        assertEquals(1, publicMethods.length);
        String name = publicMethods[0].getName();
        assertEquals("b", name);
    }

    @Test
    public void invoke() {
        Method[] publicMethods = ReflectionUtil.getPublicMethods(TestClass.class);
        Method b = publicMethods[0];
        TestClass t = ReflectionUtil.newInstance(TestClass.class);
        Object r = ReflectionUtil.invoke(t, b);
        assertEquals("b", r);
    }
}