package com.dene.match;

public class Prediction {
	
	private Fixture fixture;
	private int homeScore;
	private int awayScore;
	
	public Prediction(Fixture fixture, int homeScore, int awayScore) {
		super();
		this.fixture = fixture;
		this.homeScore = homeScore;
		this.awayScore = awayScore;
	}

	public Fixture getFixture() {
		return fixture;
	}

	public void setFixture(Fixture fixture) {
		this.fixture = fixture;
	}

	public int getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}

	public int getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(int awayScore) {
		this.awayScore = awayScore;
	}

}
