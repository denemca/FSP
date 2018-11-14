package com.dene.match;

public class Result extends PostMatch{
	
	public Result(Fixture fixture, int homeScore, int awayScore) {
		super();
		setFixture(fixture);
		setHomeScore(homeScore);
		setAwayScore(awayScore);
	}
}
