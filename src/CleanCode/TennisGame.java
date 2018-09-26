import java.util.Scanner;

public class TennisGame {

    public static int playerOneScore;
    public static int playerTwoScore;
    public static String playerOneName = "Mr.David";
    public static String playerTwoName = "Mr.Cold";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score player one: ");
        playerOneScore = sc.nextInt();

        System.out.print("Enter Score player two: ");
        playerTwoScore = sc.nextInt();


        if (hasWinner()) {
            System.out.println(playerWithHighestScore() + " wins");
        }

        if (hasAdvantage()) {
            System.out.println("Advantage " + playerWithHighestScore());
        }

        if (isDeuce())
            System.out.println("Deuce");

        if(playerOneScore == playerTwoScore) {
            System.out.println(translateScore(playerOneScore) + " all");
        }

        System.out.println(translateScore(playerOneScore) + " - " + translateScore(playerTwoScore));

    }


    public static boolean isDeuce() {
        return playerOneScore >= 3 && playerTwoScore == playerOneScore;
    }

    public static String playerWithHighestScore() {
        if (playerOneScore > playerTwoScore) {
            return playerOneName;
        } else {
            return playerTwoName;
        }
    }

    public static boolean hasWinner() {
        boolean isPlayerTwoWin = playerTwoScore >= 4 && playerTwoScore >= playerOneScore + 2;
        boolean isPlayerOneWin = playerOneScore >= 4 && playerOneScore >= playerTwoScore + 2;

        if(isPlayerOneWin || isPlayerTwoWin){
            return true;
        }
        return false;
    }

    public static boolean hasAdvantage() {
        boolean isPlayerTwoAdvantage = playerTwoScore >= 4 && playerTwoScore == playerOneScore + 1;
        boolean isPlayerOneAdvantage = playerOneScore >= 4 && playerOneScore == playerTwoScore + 1;

        if (isPlayerOneAdvantage || isPlayerTwoAdvantage){
            return true;
        }
        return false;
    }


    public static String translateScore(int score) {
        switch (score) {
            case 3:
                return "Forty";
            case 2:
                return "Thirty";
            case 1:
                return "Fifteen";
            case 0:
                return "Love";
        }
        return ("Illegal score: " + score);
    }
}