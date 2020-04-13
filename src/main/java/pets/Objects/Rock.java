package pets.Objects;

public class Rock extends Pets  implements Comparable {
    public Rock(String name){
        super(name);
    }
    public String speak(){
        return "......";
    }
    @Override
    public String toString() {
        return "Pets";
    }
}
