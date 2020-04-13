package pets.Objects;

public class Rock extends Pets {
    public Rock(String name){
        super(name);
    }
    public String speak(){
        return "......";
    }
    @Override
    public String toString() {
        return "Rock";
    }
}
