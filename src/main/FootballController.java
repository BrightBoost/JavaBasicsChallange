package main;

import java.util.ArrayList;
import java.util.List;

public class FootballController {

    private List<Team> teams = new ArrayList<>();

    public void initNewTournament() {
        createTeams();
    }

    private void createTeams() {
        // Professional teams
        teams.add(new ProfessionalTeam("Team1", 100, "SponsorA"));
        teams.add(new ProfessionalTeam("Team2",200, "SponsorB"));
        teams.add(new ProfessionalTeam("Team3",300, "SponsorC"));
        teams.add(new ProfessionalTeam("Team4",400, "SponsorD"));

        // Amature teams
        teams.add(new AmatureTeam("Team5","mascot1", "barA"));
        teams.add(new AmatureTeam("Team6","mascot2", "barB"));
        teams.add(new AmatureTeam("Team7","mascot3", "barC"));
        teams.add(new AmatureTeam("Team8","mascot4", "barD"));
    }

    public void nextRound() {
        List<Team> winningTeams = new ArrayList<>();

        while (teams.size() != 0) {

            // Pick two random teams
            Team team1 = pickRandomTeamFromList();
            Team team2 = pickRandomTeamFromList();

            // Create score for both teams
            int goalsTeam1 = (int)(Math.random() * 10) + 1;
            int goalsTeam2 = (int)(Math.random() * 10) + 1;

            // Determine winner
            Team winner = determineWinner(team1, goalsTeam1, team2, goalsTeam2);
            winningTeams.add(winner);

            // Print score
            printEndScore(winner, goalsTeam1, goalsTeam2);
        }
        System.out.println("");

        // Fill current team list with teams dat have won their match
        teams = winningTeams;
    }

    private void printEndScore(Team winner, int goalsTeam1, int goalsTeam2) {
        System.out.print(winner.getTeamName() + " won the match: " + goalsTeam1 + "-" + goalsTeam2);
        if (goalsTeam1 == goalsTeam2) {
            System.out.println(" (won by penalties)");
        }
        else {
            System.out.println("");
        }
    }

    private Team pickRandomTeamFromList() {
        Team team = teams.get((int)(Math.random() * teams.size()));
        teams.remove(team);

        return team;
    }

    private Team determineWinner(Team team1, int goalsTeam1, Team team2, int goalsTeam2) {
        Team winner;

        // Determine winner - no draw
        if (goalsTeam1 < goalsTeam2) {
            return team2;
        }
        else if (goalsTeam2 < goalsTeam1) {
            return team1;
        }

        // Determine winner - draw
        if(Math.random() < 0.5) {
            return team1;
        }

        return team2;
    }

    public void showWinnerText() {
        teams.get(0).showWinningMessage();
    }

    public boolean winnerKnown() {
        if (teams.size() == 1) {
            return true;
        }
        return false;
    }
}
