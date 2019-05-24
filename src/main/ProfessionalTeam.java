package main;

public class ProfessionalTeam extends Team {
    private double budget;
    private String sponsor;

    public ProfessionalTeam(String teamName, double budget, String sponsor) {
        super.setTeamName(teamName);
        setBudget(budget);
        setSponsor(sponsor);
    }

    public double getBudget() {
        return budget;
    }

    private void setBudget(double budget) {
        this.budget = budget;
    }

    public String getSponsor() {
        return sponsor;
    }

    private void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public void showWinningMessage() {
        System.out.println(super.getTeamName() + " has won the football games and is enjoying a party with their sponsor " + sponsor);
    }
}
