package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Song;

@Service
public interface SongRepository extends JpaRepository<Song,Integer>{

	

}
