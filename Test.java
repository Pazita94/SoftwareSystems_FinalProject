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
        new Player ("Giannis", "Antetokounmpo", bucks, "Greek", 2.11, 101); }
}