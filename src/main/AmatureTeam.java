package main;

public class AmatureTeam extends Team {
    private String mascot;
    private String drinkingBar;

    public AmatureTeam(String teamName, String mascot, String drinkingBar) {
        super.setTeamName(teamName);
        setMascot(mascot);
        setDrinkingBar(drinkingBar);
    }

    public String getMascot() {
        return mascot;
    }

    private void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public String getDrinkingBar() {
        return drinkingBar;
    }

    private void setDrinkingBar(String drinkingBar) {
        this.drinkingBar = drinkingBar;
    }

    public void showWinningMessage() {
        System.out.println(super.getTeamName() + " has won the football games and is enjoying a party with their mascot " + mascot);
    }
}
