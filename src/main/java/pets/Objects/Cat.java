package pets.Objects;

public class Cat extends Pets implements Comparable {
    public Cat(String name){
        super(name);
    }
    @Override
    public String speak(){
        return "Mew~";
    }
    @Override
    public String toString() {
        return "Cat";
    }
}
