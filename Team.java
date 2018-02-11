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

    
     public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFounded() {
        return founded;
    }

    public int getChampionships() {
        return championships;
    }

    public String toString() {
        return "[name="+this.name+", founded="+this.founded+", championships="+this.championships+", id="+this.id+"]";
    }
}
