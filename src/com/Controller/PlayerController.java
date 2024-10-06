package com.Controller;

import java.util.ArrayList;
import java.util.List;

import com.ServicePlayer.PlayerService;
import com.entity.Player;

public class PlayerController {
	

		PlayerService ser = new PlayerService();
		
		public List<Player> allPlayerIPL(){
			List<Player> allplayer = ser.allPlayer();
			return allplayer;
		}
		
		public List<Player> allBatterIPL(){
			List<Player> allbatter = ser.allBatter();
			return allbatter;
		}
		public List<Player> allBowlerIPL(){
			List<Player> allbatter = ser.allBowler();
			return allbatter;
		}
		public List<Player> allRounderIPL(){
			List<Player> allrounder = ser.allRounder();
			return allrounder;
		}
		public List<Player> allBatterRCB(){
			List<Player> rcb = ser.allRCBBatter();
			return rcb;
		}
		public List<Player> allBatterMI(){
			List<Player> mi = ser.allMIBatter();
			return mi;
		}
		public List<Player> allBatterCSK(){
			List<Player> csk = ser.allCSKBatter();
			return csk;
		}
		public List<Player> allBowlerRCB(){
			List<Player> rcb = ser.rcbBowler();
			return rcb;
		}
		public List<Player> allBowlerMI(){
			List<Player> mi = ser.miBowler();
			return mi;
		}
		public List<Player> allBowlerCSK(){
			List<Player> csk = ser.cskBowler();
			return csk;
		}
		public List<Player> nameStartWithIPL(){
			List<Player> name = ser.nameStartWith();
			return name;
		}
		
	
	
	
	

}
