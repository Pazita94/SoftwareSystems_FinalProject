public class Team {

    static Team[] teams = new Team[10];

    String name;
    int founded;
    int championships;
    int id;
    static int counter = 0;

    public Team(String name, int founded, int championships) {
        this.name = name;
        this.founded = founded;
        this.championships = championships;
        this.id = counter;
        teams[counter] = this;
        counter++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    public void setChampionships(int championships) {
        this.championships = championships;
    }

    
}
