package HomeWork4;

import java.util.Arrays;

// Rock is dog. Oliver is cat.
public class aHappyFamily {


    public static void main(String[] args) {
        Pet pet= new Pet ("Dog ", "Rock", 5, 25,
                new String[]{"eat","drink","sleep"});
        //Human{name='Michael', surname='Karleone', year=1977, iq=90,
// mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname='Rock',
// age=5, trickLevel=75, habits=[eat, drink, sleep]}}
        Human mother = new Human("Jane","Karleone",1935);
        Human father = new Human("Vito","Karleone", 1932);
        Human child = new Human ("Michael", "Karleone",1977,mother,father);

        Human human = new Human("Michael", "Karleone", 1977, 90, pet, mother, father);
        System.out.println(pet);
        pet.eat();
        pet.respond();
        pet.foul();
        System.out.println(human);
        human.describePet();
        human.greetPet();

    }


}