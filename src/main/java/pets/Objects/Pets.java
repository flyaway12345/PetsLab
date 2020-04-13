package pets.Objects;

public class Pets implements Comparable {
    private String name;
    public Pets(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "Pets Are Good Bois & Girls";
    }

    @Override
    public String toString() {
        return "Pets";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
