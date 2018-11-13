package com.dene.match;

public class Result {
	
	private Fixture fixture;
	private int homeScore;
	private int awayScore;
	
	public Result(Fixture fixture, int homeScore, int awayScore) {
		super();
		this.fixture = fixture;
		this.homeScore = homeScore;
		this.awayScore = awayScore;
	}

	public Fixture getFixture() {
		return fixture;
	}

	public int getHomeScore() {
		return homeScore;
	}

	public int getAwayScore() {
		return awayScore;
	}

}
