import java.util.stream.Stream;

public class CustomArrayListApplication {

    public static void main(String[] args) {
        CustomArrayListApplication customArrayListApplication = new CustomArrayListApplication();
        customArrayListApplication.teamsArray();
        System.out.println("-----------------------");


    }

    private void teamsArray() {
        CustomList<String> teamNames = new CustomArrayList<>();
        String[] hockeyTeamsArray = {"Edmonton Oilers", "Vancouver Canucks", "Calgary Flames", "San Jose Sharks", "Detroit RedWings", "Colorado Avalanche"
                , "Toronto Maple Leafs", "Las Vegas Golden Knights", "LA Kings", "Dallas Stars", "Chicago BlackHawks", "Anaheim Ducks", "Florida Panthers",
                "Montreal Canadians", "Nashville Predators", "New York Rangers", "Mew York Islanders", "Florida Panthers"};

        for (int i = 0; i < hockeyTeamsArray.length; i++) {


            teamNames.add(hockeyTeamsArray[i]);
            teamNames.add("Ottawa Senators");


        }
        for (int j = 0; j < teamNames.getSize(); j++) {
            System.out.println(teamNames.get(j));

        }
        System.out.println(teamNames.getSize());
        Stream.of(hockeyTeamsArray).forEach(System.out::println);
    }


}
