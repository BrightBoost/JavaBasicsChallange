package test;

import main.ProfessionalTeam;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProfessionalTeamTest {
    @Test
    public void checkForNullValues() {
        ProfessionalTeam team = new ProfessionalTeam("name", 100, "sponsor1");

        assertNotNull(team.getTeamName(), "Team name can not be null");
        assertNotNull(team.getBudget(), "Budget can not be null");
        assertNotNull(team.getSponsor(), "Sponsor can not be null");
    }

    @Test
    public void budgetNotMinus() {
        ProfessionalTeam team = new ProfessionalTeam("name", 1, "sponsor1");

        assertTrue(team.getBudget() >= 0, "Budget can not be negative");
    }
}
