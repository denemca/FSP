package com.dene.match;

public class Prediction extends PostMatch{
	
	public Prediction(Fixture fixture, int homeScore, int awayScore) {
		super();
		setFixture(fixture);
		setHomeScore(homeScore);
		setAwayScore(awayScore);
	}
}
