import java.util.stream.Stream;

public class CustomArrayListApplication {

    public static void main(String[] args) {
        CustomArrayListApplication customArrayListApplication = new CustomArrayListApplication();
        customArrayListApplication.teamsArray();
        System.out.println("-----------------------");
        customArrayListApplication.numbersArray();


    }

    private void teamsArray() {
        CustomList<String> teamNames = new CustomArrayList<>();
        String[] hockeyTeamsArray = {"Edmonton Oilers", "Vancouver Canucks", "Calgary Flames", "San Jose Sharks", "Detroit RedWings", "Colorado Avalanche"
                , "Toronto Maple Leafs", "Las Vegas Golden Knights", "LA Kings", "Dallas Stars", "Chicago BlackHawks", "Anaheim Ducks", "Florida Panthers",
                "Montreal Canadians", "Nashville Predators", "New York Rangers", "Mew York Islanders", "Florida Panthers"};

        for (int i = 0; i < hockeyTeamsArray.length; i++) {


            teamNames.add(hockeyTeamsArray[i]);


        }
        for (int j = 0; j < teamNames.getSize(); j++) {
            System.out.println(teamNames.get(j));

        }
        System.out.println(teamNames.getSize());
        Stream.of(hockeyTeamsArray).forEach(System.out::println);
    }

    private void numbersArray() {
        CustomList<Integer> numbers = new CustomArrayList<>();
        for (int i = 1; i < 99; i++) {
            numbers.add(i);
        }
        for (int j = 0; j < numbers.getSize(); j++) {
            System.out.println(numbers.get(j));
        }
        System.out.println(numbers.getSize());
        System.out.println(numbers.get(99));
//


    }

}
