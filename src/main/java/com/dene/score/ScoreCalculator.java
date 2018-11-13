package com.dene.score;

import com.dene.match.Prediction;
import com.dene.match.Result;

public class ScoreCalculator {

	public int calculate(Prediction prediction, Result result) {
		int predictionHomeScore = prediction.getHomeScore();
		int predictionAwayScore = prediction.getAwayScore();
		int resultHomeScore = result.getHomeScore();
		int resultAwayScore = result.getAwayScore();
		
		if(predictionHomeScore == resultHomeScore && predictionAwayScore == resultAwayScore) {
			return 3;
		}
		return 0;
	}

}
