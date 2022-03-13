package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver,score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);


        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playername, int position) {
        System.out.println(playername + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
//        if(score >= 1000) {
//            return 1;
//        } else if(score >= 500) {
//            return 2;
//        } else if(score >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4; // Assuming position 4 will be returned
        if(score >= 1000) {
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if(score >= 100) {
            position = 3;
        }

        return position;
    }

    // Challenge
    // Create a method called displayHighScorePosition
    // It should take a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    //
    // Create a 2nd methods called calculateHighScorePosition
    // It should be sent one argument only, the player score
    // it should return an int
    // the return data should be
    // 1 if the score is >1000
    // 2 if the store is >500 and < 1000
    // 3 if the score is > 100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400, and 50
}
