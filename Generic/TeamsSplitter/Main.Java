public class Main {
    public static void main(String[] args) {

        LeagueTable<FootballTeam> footballLeague = new LeagueTable<>();
        footballLeague.addTeam(new FootballTeam("Manchester United"));
        footballLeague.addTeam(new FootballTeam("Liverpool"));
        footballLeague.addTeam(new FootballTeam("Chelsea"));

        LeagueTable<BasketballTeam> basketballLeague = new LeagueTable<>();
        basketballLeague.addTeam(new BasketballTeam("Chicago Bulls"));
        basketballLeague.addTeam(new BasketballTeam("Los Angeles Lakers"));
        basketballLeague.addTeam(new BasketballTeam("Miami Heat"));

        System.out.println("Football teams: " + footballLeague.getTeams());
        System.out.println("Basketball teams: " + basketballLeague.getTeams());

    }

}
