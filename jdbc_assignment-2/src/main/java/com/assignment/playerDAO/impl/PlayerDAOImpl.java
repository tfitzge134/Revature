package com.assignment.playerDAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.assignment.dbutil.PlayerDAO;
import com.assignment.dbutil.postgresConnection;
import com.assignment.model.Player;

public class PlayerDAOImpl implements PlayerDAO{

	//private Connection connection;

	@Override
	public int addPlayer(Player player) {
		// TODO Auto-generated method stub
		int c =0;
		try(Connection connection = postgresConnection.getConnection()){
		String sql = "insert into player_schema.information_schema.player(id, name, age, city, gender) values"
				+ "(?,?, ?, ?, ?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, player.getId());
		preparedStatement.setString(2, player.getName());
		preparedStatement.setInt(3, player.getAge());
		preparedStatement.setString(4, player.getCity());
		preparedStatement.setString(5, player.getGender());
		
		c=preparedStatement.executeUpdate();
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return c;
	}

}
