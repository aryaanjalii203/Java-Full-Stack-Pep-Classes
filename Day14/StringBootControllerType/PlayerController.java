package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
@Autowired
PlayerService ps;
@GetMapping("/Players")
public List<PlayerModel> showPlayers(){
	return this.ps.getAllPlayers();
}
}
