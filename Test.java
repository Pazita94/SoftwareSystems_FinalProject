import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Test {

    public static void main (String args[]){

        Team celtics = new Team("Boston Celtics", 1946, 17);
        Team bulls = new Team("Chicago Bulls", 1966, 6);
        Team spurs = new Team("San Antonio Spurs", 1967, 5);
        Team lakers = new Team("Los Angeles Lakers", 1947, 16);
        Team bucks = new Team("Milwaukee Bucks", 1968, 1);

        new Player ("Kyrie", "Irving", celtics, "American", 1.91, 88);
        new Player ("Lauri", "Markkanen", bulls, "Finnish", 2.13, 104);
        new Player ("Tony", "Parker", spurs, "French", 1.88, 84);
        new Player ("Manu", "Ginobili", spurs, "Argentine", 1.98, 93);
        new Player ("Luol", "Deng", lakers, "British", 2.06, 100);
        new Player ("Giannis", "Antetokounmpo", bucks, "Greek", 2.11, 101); 



        while (true) {
            System.out.println("*********** Welcome to our DMST NBA Application ***********");
            System.out.println("Menu:");
            System.out.println("Type 1 to display teams' list");
            System.out.println("Type 2 to search players by team's name");
            System.out.println("Type 3 to create new team");
            System.out.println("Type 4 to display the tallest player");
            System.out.println("Type 5 to change a player's weight");
            System.out.println("\t Type here:");
            Scanner scanner = new Scanner(System.in);
            int x = -1;
            try {
                x = scanner.nextInt();
            } catch (InputMismatchException e) {}

            if (x == 1) {
                System.out.println("** Display Team's List **");
                int i = 0;
                while (Team.teams[i] != null) {
                    System.out.println("- Team " + Team.teams[i].toString());
                    i++;
                }
            }
            else if (x == 2) {
                scanner = new Scanner(System.in);
                System.out.println("\nGive the team's name");
                System.out.println("\t Type here:");
                String teamName = scanner.nextLine();

                ArrayList<Player> playersFound = new ArrayList<Player>();
                int i = 0;
                while (Player.players[i] != null) {
                    if (teamName.equals(Player.players[i].getTeam().getName())) {
                        playersFound.add(Player.players[i]);
                    }
                    i++;
                }
                System.out.println("** Display "+teamName+"' Player List **");
                System.out.println(playersFound.size() + " players were found:");
                for (Player player : playersFound) {
                    System.out.println("Name: "+player.getFirstName()+" "+player.getLasttName()+" , Nationality: "+player.getNationality());
                }
            }
            else if (x == 3) {
                if (Team.counter == 10) {
                    System.out.println("Team's List is full!!!");
                }
                else {
                    scanner = new Scanner(System.in);
                    System.out.println("\nWhat is the team's name?");
                    System.out.println("\t Type here:");
                    String name = scanner.nextLine();
                    boolean valid = false;
                    int founded = -1;
                    int championships = -1;
                    while (!valid) {
                        scanner = new Scanner(System.in);
                        System.out.println("\nWhen the team was founded?");
                        System.out.println("\t Type here:");
                        try {
                            founded = scanner.nextInt();
                            if (founded < 1800 || founded > 2018) {
                                System.out.println("Give a valid year!!!");
                            }
                            else {
                                valid = true;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("You did not type an integer!!!");
                        }
                    }
                    valid = false;
                    while (!valid) {
                        scanner = new Scanner(System.in);
                        System.out.println("\nHow many championships has the team won?");
                        System.out.println("\t Type here:");
                        try {
                            championships = scanner.nextInt();
                            if (championships < 0 || championships > 100) {
                                System.out.println("Give a valid number of championships!!!");
                            }
                            else {
                                valid = true;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("You did not type an integer!!!");
                        }
                    }
                    new Team(name, founded, championships);
                }
            }
            else if (x == 4) {
                Player tallestPlayer = Player.players[0];
                for (int i=1; i < 10; i++) {
                    if ((Player.players[i] != null) && (Player.players[i].getHeight() > tallestPlayer.getHeight())) {
                        tallestPlayer = Player.players[i];
                    }
                }
                System.out.println("** Display Tallest Player **");
                System.out.println("Name: "+tallestPlayer.getFirstName()+" "+tallestPlayer.getLasttName()+", Nationality: "+tallestPlayer.getNationality()+", Height: "+tallestPlayer.getHeight());
            }
            else if (x == 5) {
                System.out.println("\nGive an index");
                System.out.println("\t Type here:");
                int index = scanner.nextInt();
                if (Player.players[index] == null) {
                    System.out.println("No player is stored in this index");
                }
                else {
                    Player player = Player.players[index];
                    System.out.println("You search for player stored in index "+index+" : "+player.getFirstName()+" "+player.getLasttName());
                    boolean valid = false;
                    while (!valid) {
                        scanner = new Scanner(System.in);
                        System.out.println("\nGive new weight");
                        System.out.println("\t Type here:");
                        try{
                            int weight = scanner.nextInt();
                            player.setWeight(weight);
                            System.out.println("Name: "+player.getFirstName()+" "+player.getLasttName()+", Nationality: "+player.getNationality()+", Weight: "+player.getWeight());
                            valid = true;
                        } catch (InputMismatchException e) {
                            System.out.println("You did not type an integer!!!");
                        }
                    }


                }
            }
            else {
                System.out.println("Error!!! You did not type 1 or 2.");
            }
            System.out.println("**************************************************");
            System.out.println("\n\n\n");
        }

    }
}