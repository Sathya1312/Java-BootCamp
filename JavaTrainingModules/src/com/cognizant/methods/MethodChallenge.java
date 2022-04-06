package com.cognizant.methods;

public class MethodChallenge {

	public static void main(String[] args) {
		int playerScore = calculateHighScore(1500);
		displayHighScorePosition("Sathya", playerScore);
		
		displayHighScorePosition("Priya", calculateHighScore(900));
		
		displayHighScorePosition("Anitha", calculateHighScore(400));
		
		displayHighScorePosition("Vinitha", calculateHighScore(50));

	}
	
	public static int calculateHighScore(int score){
		if(score >= 1000){
			return 1;
		}else if(score >=500 && score < 1000){
			return 2;
		}else if(score >=100 && score < 500){
			return 3;
		}
		return 4;
	}
	
	public static void displayHighScorePosition(String playerName, int position){
		System.out.println(playerName + " managed to get to positon " + position + " on the high score table");
	}

}
