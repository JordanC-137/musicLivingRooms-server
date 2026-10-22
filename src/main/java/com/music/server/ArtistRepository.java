package com.music.server;

import com.music.server.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

interface ArtistRepository extends JpaRepository<Artist, Long> {

}