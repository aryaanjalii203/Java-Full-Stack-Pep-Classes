package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
@Autowired
PlayerService ps;
@GetMapping("/Players")
public List<PlayerModel> showPlayers(){
	return this.ps.getAllPlayers();
}
@GetMapping("/player/{id}")
public PlayerModel getOnePlayer(@PathVariable int id) {
	return this.ps.getSinglePlayer(id);
}
@PostMapping("/player/save")
public void addPlayer(@RequestBody PlayerModel p) {
	this.ps.savePlayer(p);
}


}
