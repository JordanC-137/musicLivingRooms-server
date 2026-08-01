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
    void getsWithEmptyLists(){
        restTestClient.get().uri("/albums")
        .exchange()
        .expectBody().json("[]");

        restTestClient.get().uri("/albums/1")
        .exchange()
        .expectStatus()
        .isNotFound();

        // Create album
        Album a1 = new Album("Ziggy Stardust");

        restTestClient.post().uri("/albums")
        .body(a1)
        .accept(MediaType.APPLICATION_JSON)
        .exchange()
        .expectStatus()
        .isOk()
        .expectBody(Album.class)
        .isEqualTo(new Album("Ziggy Stardust"));

        restTestClient.get()
        .uri("/albums/1")
        .accept(MediaType.APPLICATION_JSON)
        .exchange()
        .expectBody(Album.class)
        .isEqualTo(a1);

        restTestClient.delete()
        .uri("/albums/1")
        .accept(MediaType.APPLICATION_JSON)
        .exchange();
    }
}