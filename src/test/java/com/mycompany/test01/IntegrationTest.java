package com.mycompany.test01;

import com.mycompany.test01.Test01App;
import com.mycompany.test01.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { Test01App.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
