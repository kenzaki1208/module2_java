package week6.inheritance.tuesday2.practice.src.com.codegym;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        if (player1Score == player2Score) {
            score = getScoreDescription(player1Score);
        }
        else {
            boolean isPlayer1Leading = player1Score >= 4;
            boolean isPlayer2Leading = player2Score >= 4;
            if (isPlayer1Leading || isPlayer2Leading) {
                score = getMatchScore(player1Score, player2Score);
            }
            else {
                score = displayCurrentScore(player1Score, player2Score);
            }
        }
        return score;
    }

    private static String getMatchScore(int player1Score, int player2Score) {
        String score;
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference==1) score ="Advantage player1";
        else if (scoreDifference ==-1) score ="Advantage player2";
        else if (scoreDifference>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String displayCurrentScore(int player1Score, int player2Score) {
        return scoreToString(player1Score) + "-" + scoreToString(player2Score);
    }

    private static String getScoreDescription(int score) {
        switch (score)
        {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String scoreToString(int score) {
        switch (score)
        {
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "";
        }
    }
}