package com.dene.score;

import com.dene.match.PostMatch;
import com.dene.match.Prediction;
import com.dene.match.Result;

public class ScoreCalculator {
	
	private int getResult(PostMatch match) {
// 0 for draw, 1 for home win, 2 for away win
		int homeScore = match.getHomeScore();
		int awayScore = match.getAwayScore();
		
		if(homeScore == awayScore) {
			return 0;
		} else if(homeScore > awayScore) {
			return 1;
		} else if(awayScore > homeScore) {
			return 2;
		} else {
			return 3;
		}
	}

	public int calculate(Prediction prediction, Result result) {
		
		int playerScore = 0;
		
		int predictionHomeScore = prediction.getHomeScore();
		int predictionAwayScore = prediction.getAwayScore();
		int resultHomeScore = result.getHomeScore();
		int resultAwayScore = result.getAwayScore();
			
		int predictionResult = getResult(prediction);
		int resultResult = getResult(result);
		
		if(predictionResult == resultResult) {
			playerScore++;
		}
		
		if(predictionHomeScore == resultHomeScore && predictionAwayScore == resultAwayScore) {
			playerScore += 2;
		}
		return playerScore;
	}

}
