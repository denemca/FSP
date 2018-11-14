package com.dene.score;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.dene.match.Fixture;
import com.dene.match.Prediction;
import com.dene.match.Result;
import com.dene.match.Team;

public class ScoreCalculatorTests {
	
	Team homeTeam;
	Team awayTeam;
	Fixture fixture;
	ScoreCalculator scoreCalculator;
	
	@Before
	public void set() {
		homeTeam = new Team(0, "Home");
		awayTeam = new Team(1, "Away");		
		fixture = new Fixture(0, homeTeam, awayTeam);
		scoreCalculator = new ScoreCalculator();
	}
		
	@Test
	public void testThatNoPointsAreGivenForIncorrectPrediction() {
		Prediction prediction = new Prediction(fixture, 0, 0);
		Result result = new Result(fixture, 1, 0);
		int score = scoreCalculator.calculate(prediction, result);
		assertEquals(score, 0);
	}
	
	@Test
	public void testThatThreePointsAreGivenForExactPrediction() {
		Prediction prediction = new Prediction(fixture, 1, 0);
		Result result = new Result(fixture, 1, 0);
		int score = scoreCalculator.calculate(prediction, result);
		assertEquals(score, 3);
	}
	
	@Test
	public void testThatOnePointIsGivenForACorrectResultButWrongScore() {
		Prediction prediction = new Prediction(fixture, 1, 0);
		Result result = new Result(fixture, 2, 0);
		int score = scoreCalculator.calculate(prediction, result);
		assertEquals(score, 1);
	}

}
