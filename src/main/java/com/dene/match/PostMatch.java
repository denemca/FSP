package com.dene.match;

public abstract class PostMatch {

	private Fixture fixture;
	private int homeScore;
	private int awayScore;
	
	@Override
	public String toString() {
		return "PostMatch [fixture=" + fixture + ", homeScore=" + homeScore + ", awayScore=" + awayScore + "]";
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
