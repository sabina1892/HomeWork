package HomeWork4;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    String[] habits;
    int age;
    int trickLevel;


    public Pet(
            String species,
            String nickname,
            int age,
            int trickLevel,
            String[] habits
    ) {
        this.species = species;
        this.nickname = nickname;
        this.habits = habits;
        this.age = age;
        this.trickLevel = trickLevel;
    }
    public Pet(){}
    public Pet(String species,
               String nickname)
    {
        this.species = species;
        this.nickname = nickname;
    }

    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public String toString() {
        return (species + "{nickname= '" + nickname + "' , age= " + age + ", trickLevel= " +
                trickLevel + ",habits=" + Arrays.toString(getHabits()) + "}");
    }

    void eat() {
        System.out.println("I am eating");
    }

    void respond() {
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!'");
    }

    void foul() {
        System.out.println("I need to cover it up");
    }
}
