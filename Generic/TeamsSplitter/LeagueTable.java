import java.util.*;

public class LeagueTable<T> {
    private List<T> teams;

    public LeagueTable() {
        this.teams = new ArrayList<>();
    }

    public void addTeam(T team) {
        teams.add(team);
    }

    public List<T> getTeams() {
        return teams;
    }

}