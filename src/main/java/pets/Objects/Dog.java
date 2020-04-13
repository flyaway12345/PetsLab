package pets.Objects;

public class Dog extends Pets implements Comparable{
    public Dog(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Bork bork";
    }
    @Override
    public String toString() {
        return "Dog";
    }
}

