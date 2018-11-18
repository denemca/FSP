package com.dene.data;

import java.util.ArrayList;
import java.util.List;

import com.dene.player.Player;

public class MockData {
	
	public List<Player> getPlayers() {
		Player player1 = new Player(0, "Foo");
		Player player2 = new Player(1, "Bar");
		Player player3 = new Player(2, "Baz");
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(player1);
		players.add(player2);
		players.add(player3);
		return players;
	}

}
