package com.fengchao.pma.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog4j {

    public static void main(String[] args) {
    new Test().test("huangfeihong");

    }
}

/**
 * 测试类
 */
class Test {
    Logger log = LoggerFactory.getLogger(Test.class);
    public void test(String name) {
        log.info(" hello, my name is [{}]", name);
    }
}