package main;

public class FootballApplication {
    public static void main(String[] args) {
        FootballController footballController = new FootballController();

        // Create teams
        footballController.initNewTournament();

        // Loop through rounds till 1 team remains
        while (!footballController.winnerKnown()) {
            footballController.nextRound();
        }

        // Show winner text
        footballController.showWinnerText();
    }
}
