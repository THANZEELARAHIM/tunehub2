package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Playlist;
import com.example.demo.repository.PlayListRepository;

@Service
public class PlayListServiceImplemtation implements
PlayListService
{
@Autowired
PlayListRepository repo;
	@Override
	public void addplaylist(Playlist playlist) {
		// TODO Auto-generated method stub
		repo.save(playlist);
		
	}

}
