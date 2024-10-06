package com.ServicePlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.Playerdao.PlayerDao;
import com.entity.Player;

public class PlayerService {
	
	PlayerDao dao = new PlayerDao();
	Map<String,List<Player>> team = dao.team;
	
	public List<Player> allPlayer(){
		List<Player> all = new ArrayList<>();
		
		for(String key : team.keySet()) {
//			System.out.println(key);
			List<Player> value = team.get(key);
			for(Player player : value) {
				all.add(player);
			}
		}
		
		return all;
	}
	
	public List<Player> allBatter(){
		List<Player> allBatter = new ArrayList<>();
		for(String key : team.keySet()) {
			List<Player> values = team.get(key);
			for(Player player : values) {
				
				if(player.getRuns()>5000) {
					allBatter.add(player);
				}
			
			}
		}
		return allBatter;
	}
	
	public List<Player> allBowler(){
		List<Player> allBowler = new ArrayList<>();
		
		for(String key : team.keySet()) {
			List<Player> values = team.get(key);
			
			for(Player player: values) {
				if(player.getWickets()>50) {
					allBowler.add(player);
				}
				
			}
		}
		return allBowler;
	}
	
	public List<Player> allRounder(){
		List<Player> allrounder = new ArrayList<>();
		
		for(String key : team.keySet()) {
			List<Player> values = team.get(key);
			for(Player player: values) {
				if(player.getRuns()>5000 && player.getWickets()>50) {
					allrounder.add(player);
				}
			}
		}
		return allrounder;
	}
	
	public List<Player> allRCBBatter(){
		List<Player> rcbBatter = new ArrayList<>();
		
			List<Player> values = team.get("rcb");
			for(Player player : values) {
				if(player.getRuns()>5000) {
					rcbBatter.add(player);
					
				}
			}
		
		return rcbBatter;
	}
	public List<Player> allMIBatter(){
		List<Player> miBatter = new ArrayList<>();
		
			List<Player> values = team.get("mi");
			for(Player player : values) {
				if(player.getRuns()>5000) {
					miBatter.add(player);
					
				}
			}
		
		return miBatter;
	}
	public List<Player> allCSKBatter(){
		List<Player> cskBatter = new ArrayList<>();
		
			List<Player> values = team.get("csk");
			for(Player player : values) {
				if(player.getRuns()>5000) {
					cskBatter.add(player);
					
				}
			}
		
		return cskBatter;
	}
	
	public List<Player> rcbBowler(){
		List<Player> rcbBowler = new ArrayList<>();
		
		List<Player> values = team.get("rcb");
		for(Player player : values) {
			if(player.getWickets()>50) {
				rcbBowler.add(player);
			}
		}
		return rcbBowler;
	}
	public List<Player> miBowler(){
		List<Player> miBowler = new ArrayList<>();
		
		List<Player> values = team.get("mi");
		for(Player player : values) {
			if(player.getWickets()>50) {
				miBowler.add(player);
			}
		}
		return miBowler;
	}
	public List<Player> cskBowler(){
		List<Player> cskBowler = new ArrayList<>();
		
		List<Player> values = team.get("csk");
		for(Player player : values) {
			if(player.getWickets()>50) {
				cskBowler.add(player);
			}
		}
		return cskBowler;
	}
	
	public List<Player> nameStartWith(){
		List<Player> start = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(String t : team.keySet()) {
			List<Player> values = team.get(t);
			for(Player player : values) {
				String playerName = player.getName().trim();
				char trimName = playerName.charAt(0);
				if(str.equalsIgnoreCase(Character.toString(trimName))) {
					start.add(player);
				}
				
			}
		}
		return start;
	}
	

}
