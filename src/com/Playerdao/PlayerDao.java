package com.Playerdao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.entity.Player;

public class PlayerDao {
	// <team , Player>

	public Map<String, List<Player>> team = new HashMap<>();

	List<Player> rcbPlayer = new ArrayList<>();
	List<Player> miPlayer = new ArrayList<>();
	List<Player> cskPlayer = new ArrayList<>();

	public Map<String, List<Player>> allPlayer() {

		rcbPlayer.add(new Player("Virat Kohli", 18, 11000, 17, "RCB"));
		rcbPlayer.add(new Player("AB de Villiers", 17, 9500, 22, "RCB"));
		rcbPlayer.add(new Player("Glenn Maxwell", 14, 7500, 63, "RCB"));
		rcbPlayer.add(new Player("Faf du Plessis", 21, 7200, 12, "RCB"));
		rcbPlayer.add(new Player("Yuzvendra Chahal", 3, 1500, 110, "RCB"));
		rcbPlayer.add(new Player("Harshal Patel", 5, 800, 98, "RCB"));
		rcbPlayer.add(new Player("Mohammed Siraj", 8, 500, 72, "RCB"));
		rcbPlayer.add(new Player("Shahbaz Ahmed", 9, 5100, 65, "RCB"));
		rcbPlayer.add(new Player("Wanindu Hasaranga", 7, 1100, 85, "RCB"));
		rcbPlayer.add(new Player("Josh Hazlewood", 4, 200, 58, "RCB"));
		team.put("rcb", rcbPlayer);

		miPlayer.add(new Player("Rohit Sharma", 20, 12000, 12, "MI"));
		miPlayer.add(new Player("Kieron Pollard", 15, 10500, 18, "MI"));
		miPlayer.add(new Player("Suryakumar Yadav", 12, 8700, 51, "MI"));
		miPlayer.add(new Player("Ishan Kishan", 9, 5000, 5, "MI"));
		miPlayer.add(new Player("Jasprit Bumrah", 3, 1400, 130, "MI"));
		miPlayer.add(new Player("Trent Boult", 4, 5010, 92, "MI"));
		miPlayer.add(new Player("Lasith Malinga", 2, 800, 170, "MI"));
		miPlayer.add(new Player("Rahul Chahar", 8, 1200, 63, "MI"));
		miPlayer.add(new Player("Nathan Coulter-Nile", 6, 600, 57, "MI"));
		miPlayer.add(new Player("Mitchell McClenan", 7, 300, 76, "MI"));
		team.put("mi", miPlayer);

		cskPlayer.add(new Player("MS Dhoni", 19, 11000, 17, "CSK"));
		cskPlayer.add(new Player("Faf du Plessis", 18, 8500, 16, "CSK"));
		cskPlayer.add(new Player("Suresh Raina", 17, 10000, 22, "CSK"));
		cskPlayer.add(new Player("Ruturaj Gaikwad", 11, 7000, 8, "CSK"));
		cskPlayer.add(new Player("Ravindra Jadeja", 5, 5200, 105, "CSK"));
		cskPlayer.add(new Player("Dwayne Bravo", 3, 5001, 160, "CSK"));
		cskPlayer.add(new Player("Deepak Chahar", 4, 600, 72, "CSK"));
		cskPlayer.add(new Player("Imran Tahir", 7, 300, 90, "CSK"));
		cskPlayer.add(new Player("Shardul Thakur", 6, 800, 65, "CSK"));
		cskPlayer.add(new Player("Mohit Sharma", 8, 1000, 65, "CSK"));
		team.put("csk", cskPlayer);

		return team;
	}

	public PlayerDao() {
		allPlayer();
	}

}
