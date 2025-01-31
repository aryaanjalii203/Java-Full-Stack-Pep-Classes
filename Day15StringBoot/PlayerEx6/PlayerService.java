package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	List<PlayerModel> list=new ArrayList<PlayerModel>();
	PlayerModel p1=new PlayerModel(101,"Anjali Arya");
	PlayerModel p2=new PlayerModel(102,"Issar Singh\n");
	PlayerModel p3=new PlayerModel(103,"Amrender Singh\n");
	PlayerModel p4=new PlayerModel(104,"Rohit Choudhary\n");
	PlayerModel p5=new PlayerModel(105,"Shabnam Thakur\n");
	public PlayerService()
	{
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
	}
	public List<PlayerModel> getAllPlayers(){
		return list;
	}
	public PlayerModel getSinglePlayer(int id) {
		for(PlayerModel p:list) {
			if(p.getId()==id) {
				return p;
			}
		}
		return null;
	}
	public void savePlayer(PlayerModel p) {
		this.list.add(p);
		
	}
	
	public void updatePlayerService(PlayerModel p1) {
		for(PlayerModel p2:list) {
			if(p2.getId()==p1.id) {
				p2.setName(p1.getName());
			}
		}		
	}
	public void deletePlayerService(int id) {
		for(PlayerModel p:list) {
			if(p.getId()==id) {
				list.remove(p);
				break;

			}
		}
		
	}
}
