package com.dene.score;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dene.match.Fixture;
import com.dene.match.Prediction;
import com.dene.match.Result;
import com.dene.match.Team;

public class ScoreCalculatorTests {
		
	@Test
	public void testThatNoPointsAreGivenForIncorrectPrediction() {
		Team homeTeam = new Team(0, "Home");
		Team awayTeam = new Team(1, "Away");		
		Fixture fixture = new Fixture(0, homeTeam, awayTeam);
		Prediction prediction = new Prediction(fixture, 0, 0);
		Result result = new Result(fixture, 1, 0);
		ScoreCalculator scoreCalculator = new ScoreCalculator();
		int score = scoreCalculator.calculate(prediction, result);
		assertEquals(score, 0);
	}
	
	@Test
	public void testThatThreePointsAreGivenForCorrectPrediction() {
		Team homeTeam = new Team(0, "Home");
		Team awayTeam = new Team(1, "Away");		
		Fixture fixture = new Fixture(0, homeTeam, awayTeam);
		Prediction prediction = new Prediction(fixture, 1, 0);
		Result result = new Result(fixture, 1, 0);
		ScoreCalculator scoreCalculator = new ScoreCalculator();
		int score = scoreCalculator.calculate(prediction, result);
		assertEquals(score, 3);
	}

}
