package com.dene.match;

public class Fixture {
	
	private int fixtureId;
	private Team home;
	private Team away;
	
	public Fixture(int fixtureId, Team home, Team away) {
		super();
		this.fixtureId = fixtureId;
		this.home = home;
		this.away = away;
	}

	public int getFixtureId() {
		return fixtureId;
	}

	public Team getHome() {
		return home;
	}

	public Team getAway() {
		return away;
	}
	
}
