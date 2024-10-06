package com.Client;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.Controller.PlayerController;
import com.entity.Player;

public class PlayerClient {
public static void main(String[] args) {


	PlayerController c = new PlayerController();
	Scanner sc = new Scanner(System.in);
	
	
	
	

	do{

		System.out.println("Available Options ");
		System.out.println("0 to Print allbatters\n" + "1 to Print all allrounders\n"
				+"2 to print allBowlers\n"
		+"3 to print all rcb batters\n" + "4 to print all mi batters\n" + "5 to print all csk batters\n"
		+"6 to print all rcb bowlers\n" + "7 to print all mi bowlers\n" + "8 to print all csk bowlers\n"
		+"9 to print name startwith players \n"+"10 all player in IPL list\n"+"11 EXIT!!!");

		int option = sc.nextInt();
		sc.nextLine();

		switch (option){
		case 0 :
			List<Player> list = c.allBatterIPL();


//			Collections.sort((List<T>) list, (p1, p2) -> Integer.compare(p2.getRuns(), p1.getRuns()));

			System.out.printf("+---------------------+-----------+-------+---------+------+\n");
			System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
			System.out.printf("+---------------------+-----------+-------+---------+------+\n");
			for (Player player : list) {
				System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
						player.getName(), player.getJersey_no(), player.getRuns(), player.getWickets(), player.getTeam());
			}

			// Table Footer
			System.out.printf("+---------------------+-----------+-------+---------+------+\n");

			break;
			case 1 :
				//List of all allrounders

				System.out.println("List Of all AllRounders In IPL :");
				List<Player> allrounders = c.allRounderIPL();
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				for (Player player : allrounders) {
					System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
							player.getName(), player.getJersey_no(), player.getRuns(), player.getWickets(), player.getTeam());
				}
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				break;
			case 2 :
				System.out.println("List Of all AllBowlers In IPL :");
				List<Player> allBowlers = c.allBowlerIPL();
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				for (Player player : allBowlers) {
					System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
							player.getName(), player.getJersey_no(), player.getRuns(), player.getWickets(), player.getTeam());
				}
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				break;
			case 3 :
				System.out.println("List Of  Batters in RCB :");
				List<Player> rcbbatters = c.allBatterRCB();
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				for (Player player : rcbbatters) {
					System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
							player.getName(), player.getJersey_no(), player.getRuns(), player.getWickets(), player.getTeam());
				}
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				break;
			case 4:
				System.out.println("List Of  Batters in MI :");
				List<Player> miBatters = c.allBatterMI();
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				for (Player player : miBatters) {
					System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
							player.getName(), player.getJersey_no(), player.getRuns(), player.getWickets(), player.getTeam());
				}
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				break;
			case 5:
				System.out.println("List Of  Batters in CSK :");
				List<Player> cskBatters = c.allBatterCSK();
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				for (Player player : cskBatters) {
					System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
							player.getName(), player.getJersey_no(), player.getRuns(), player.getWickets(), player.getTeam());
				}
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				break;
			case 6:
				System.out.println("List Of  Bowlers in RCB :");
				List<Player> rcbBowlers = c.allBowlerRCB();
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				for (Player player : rcbBowlers) {
					System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
							player.getName(), player.getJersey_no(), player.getRuns(), player.getWickets(), player.getTeam());
				}
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				break;
			case 7:
				System.out.println("List Of  Bowlers in MI :");
				List<Player> miBowlers = c.allBowlerMI();
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				for (Player player : miBowlers) {
					System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
							player.getName(), player.getJersey_no(), player.getRuns(), player.getWickets(), player.getTeam());
				}
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				break;

			case 8:
				System.out.println("List Of  Bowlers in CSK :");
				List<Player> cskBowlers = c.allBowlerCSK();
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				for (Player player : cskBowlers) {
					System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
							player.getName(), player.getJersey_no(), player.getRuns(), player.getWickets(), player.getTeam());
				}
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				break;
			case 9:
				System.out.println("List Of Name Start With :");
				List<Player> start = c.nameStartWithIPL();
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				for (Player player : start) {
					System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
							player.getName(), player.getJersey_no(), player.getRuns(), player.getWickets(), player.getTeam());
				}
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				break;
				
			case 10:
				System.out.println("List Of Name Start With :");
				List<Player> all = c.allPlayerIPL();
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				System.out.printf("| %-19s | %-9s | %-5s | %-7s | %-4s |\n", "Player Name", "Jersey No", "Runs", "Wickets", "Team");
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				for (Player player : all) {
					System.out.printf("| %-19s | %-9d | %-5d | %-7d | %-4s |\n",
							player.getName(), player.getJersey_no(), player.getRuns(), player.getWickets(), player.getTeam());
				}
				System.out.printf("+---------------------+-----------+-------+---------+------+\n");
				break;

			case 11:
				System.out.println("Exiting the application. Thank you!");
				System.exit(0); // Exit the program
				break;
			default:
				System.out.println("Invalid option. Please try again.");
				break;


		}

	}while (true);
}
}
