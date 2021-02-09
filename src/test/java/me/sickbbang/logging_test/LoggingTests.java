package me.sickbbang.logging_test;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LoggingTests {

    private final static Logger log = LoggerFactory.getLogger(LogTest.class);

    @BeforeEach
    void beforeEach() {
        System.out.println("==================== START =====================");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("===================== END ======================");
    }

    @Tag("api-only")
    @Test
    @DisplayName("slf4j-api")
    void test1() {
        log.info("only slf4j-api test");
    }

    @Tag("all-dependency")
    @Test
    @DisplayName("slf4j-api + logback-classic(binding)")
    void test2() {
        System.out.println("all dependency exists1");
    }

    @Tag("all-dependency")
    @Test
    @DisplayName("slf4j-api + logback-classic(binding) + log4j2-to-slf4j(bridge)")
    void test3() {
        System.out.println("all dependency exists2");
    }

    @Tag("no-binding-dependency")
    @Test
    @DisplayName("slf4j-api + log4j2-to-slf4j(bridge) = no binding = no concrete logging framework")
    void test4() {
        // gradle exclude must be done first
        System.out.println("no binding");
    }

}