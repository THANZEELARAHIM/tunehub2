package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Playlist;

@Service
public interface PlayListRepository extends JpaRepository<Playlist,Integer> {

}
