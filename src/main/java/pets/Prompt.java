package pets;

import pets.Objects.Cat;
import pets.Objects.Dog;
import pets.Objects.Pets;
import pets.Objects.Rock;
import java.util.*;

public class Prompt {
    public static void prompt(){
        int count = 0;
        int countInput = 0;
        String name = "";
        List<Pets> pets =  new ArrayList<Pets>();
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Pets Do You Have?");
        countInput = scan.nextInt();
        while(count < countInput){
            System.out.println("What Type of Pet?");
            String userInput = scan.next().toLowerCase();
            System.out.println("What Is Their Name?");
            name = scan.next();
            switch(userInput){
                case "dog":
                    Dog dog = new Dog(name);
                    pets.add(dog);
                    break;
                case "cat":
                    Cat cat = new Cat(name);
                    pets.add(cat);
                    break;
                case "rock":
                    Rock rock = new Rock(name);
                    pets.add(rock);
                    break;
                default:
                    System.out.println("Not a valid Pet, Try Again");
                    count--;
            }
            count++;
        }
        Collections.sort(pets);
        for (Pets pet: pets) {
            System.out.println("Your "+ pet.toString()+" Named "+ pet.getName() +" Goes "+pet.speak());
        }
    }

}
