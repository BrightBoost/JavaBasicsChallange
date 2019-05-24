package test;

import main.AmatureTeam;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AmatureTeamTest {
    @Test
    public void checkForNullValues() {
        AmatureTeam team = new AmatureTeam("name", "mascot", "bar");

        assertNotNull(team.getTeamName(), "Team name can not be null");
        assertNotNull(team.getMascot(), "Mascot can not be null");
        assertNotNull(team.getDrinkingBar(), "Drinking bar can not be null");
    }
}