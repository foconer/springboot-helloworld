package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.client.RestTestClient;

/**
 * Go to <a href="https://spring.io/guides/gs/testing-web">...</a>
 */
@WebMvcTest(HelloWorldController.class)
@AutoConfigureRestTestClient
public class HelloWorldControllerTests {
    @Autowired
    private RestTestClient restTestClient;

    @Test
    void home() {
        restTestClient.get().uri("/")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class)
                .isEqualTo("Hello, World");
    }

}
