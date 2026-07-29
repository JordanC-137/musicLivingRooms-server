package com.music.server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.client.RestTestClient;
import org.springframework.http.MediaType;

@AutoConfigureRestTestClient
@SpringBootTest
class BasicTest {

    @Autowired
    private RestTestClient restTestClient;

    @Test
    void confirmEmptyInitialGet(){
        restTestClient.get().uri("/albums")
        .exchange()
        .expectBody().json("[]");
    }
}