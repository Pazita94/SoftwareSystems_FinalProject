public class Player {

    static Player[] players = new Player[10];
    static int countPlayers = 0;

    String firstName;
    String lastName;
    Team team;
    String nationality;
    double height;
    int weight;

    public Player(String firstName, String lastName, Team team, String nationality, double height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
        players[countPlayers] = this;
        countPlayers++;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        if (weight < 50 || weight > 180) {
            System.out.println("Weight did not change. Wrong value.");
        }
        else {
            this.weight = weight;
        }
    }
    
    
    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lastName;
    }

    public Team getTeam() {
        return team;
    }

    public String getNationality() {
        return nationality;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "[first name="+this.firstName+", last name="+this.lastName+", team="+this.team.toString()+", nationaltiy="+this.nationality+", height="+this.height+", weight="+this.weight+"]";
    }
}
