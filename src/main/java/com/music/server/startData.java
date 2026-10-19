package com.music.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;

@Configuration
public class startData {

    @Bean
    CommandLineRunner initialiseData(AlbumRepository repository){
        return args -> {
            repository.save(new Album("Ziggy Stardust"));
            repository.save(new Album("Aladdin Sane"));
            repository.save(new Album("Blackstar"));
            repository.save(new Album("Low"));
            repository.save(new Album("Station To Station"));
            repository.save(new Album("Heroes"));
            repository.save(new Album("Pin-Ups"));

        };
    }
}