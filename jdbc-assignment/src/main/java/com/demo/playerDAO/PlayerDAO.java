package com.demo.playerDAO;

import com.demo.model.Player;

public interface PlayerDAO {
	public int addPlayer(Player player);
	public int updatePlayer(int id, String newCity);
	public int DeletePlayerById(int id);
	public Player getPlayerById(int id);
	public List<Player> getAllPlayers();
	public List<Player> getAllPlayerssByAgeI(int age);
	

}
