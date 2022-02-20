package com.pwc.cara;

import com.pwc.cara.CaraApp;
import com.pwc.cara.CouchbaseTestContainerExtension;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = CaraApp.class)
@ExtendWith(CouchbaseTestContainerExtension.class)
public @interface IntegrationTest {
}
