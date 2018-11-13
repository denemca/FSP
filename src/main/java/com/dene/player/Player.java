package com.dene.player;

public class Player {
	
	private int userId;
	private String username;
	private int score;
	
	
	public Player(int userId, String username) {
		super();
		this.userId = userId;
		this.username = username;
	}

	public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
