package pets.Objects;

public class Dog extends Pets{
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

