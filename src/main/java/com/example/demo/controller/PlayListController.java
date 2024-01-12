package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Playlist;
import com.example.demo.entities.Song;
import com.example.demo.services.PlayListService;
import com.example.demo.services.SongService;

@Controller
public class PlayListController {
	@Autowired
SongService songService;
	@GetMapping("/createPlaylist")
	public String createPlaylist(Model model) {
		List<Song> songsList=songService.fetchAllSongs();
		model.addAttribute("songs",songsList);
		return "createPlaylist";
	}
		
		@PostMapping("/addPlaylist")
		public String addPlaylist(@ModelAttribute Playlist playlist) {
		  PlayListService.addplaylist(playlist)	;
		  List<Song> songList=playlist.getSongs();
		  for(Song s:songList) {
			  s.getPlaylist().add(playlist);
			  songService.updateSongs(s);
			  
			  //update song object in db
		  }
		  
		  return "adminHome";
		}
		

}

