package com.assignment.main;

import java.sql.SQLException;

import com.assignment.dbutil.PlayerDAO;
import com.assignment.model.Player;
import com.assignment.playerDAO.impl.PlayerDAOImpl;

public class PlayerMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		PlayerDAO dao = new PlayerDAOImpl();
		Player p = new Player(100, "raj", "Bangalore", 53, "M");
		int c = dao.addPlayer(p);
		if(c>0) {
			System.out.println("player register wiht below details" + p);
			
		}else {
			System.out.println("failure to register");
		}

	}

}


//Player p=new Player(110, "Raj", "Bangalore", 23, "M");
//
//int c=dao.addPlayer(p);
//if(c>0) {
//	System.out.println("Player registered with below details");
//	System.out.println(p);
//}else {
//	System.out.println("Failure in registration");
//}
//int id=102;
//Player player=dao.getPlayerById(id);
//if(player==null) {
//	System.out.println("No player found with id "+id);
//}else {
//	System.out.println("Player found with id = "+id+" and the details are below :");
//	System.out.println(player);
//}

//List<Player> playerList = dao.getAllPlayers();
//if (playerList.size() == 0) {
//	System.out.println("No players as of now in DB");
//} else {
//	System.out.println("Total there are " + playerList.size() + " no of player/s in DB");
//	System.out.println("Printing their details");
//	for (Player p : playerList) {
//		System.out.println(p);
//	}
//}
