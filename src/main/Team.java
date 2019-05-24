package main;

public abstract class Team {
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    protected void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public abstract void showWinningMessage();
}
