package HomeWork4;

public class Human {
    String name;
    String surname;
    int dateOfBirthyear;
    int iq;
    Pet pet;
    public Human mother;
    public Human father;

    public Human(
            String name,
            String surname,
            int dateOfBirthyear,
            int iq,
            Pet pet,
            Human mother,
            Human father
    ) {
        this.name = name;
        this.surname=surname;
        this.dateOfBirthyear=dateOfBirthyear;
        this.iq=iq;
        this.pet=pet;
        this.mother=mother;
        this.father=father;
    }
    public Human(
            String name,
            String surname,
            int dateOfBirthyear
    ){
        this.name = name;
        this.surname=surname;
        this.dateOfBirthyear=dateOfBirthyear;
    }
    public Human(
            String name,
            String surname,
            int dateOfBirthyear,
            Human mother,
            Human father
    ){
        this.name = name;
        this.surname=surname;
        this.dateOfBirthyear=dateOfBirthyear;
        this.mother=mother;
        this.father=father;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public int getDateOfBirthyear(){
        return dateOfBirthyear;
    }
    public int getIq(){
        return iq;
    }//Human{name='Michael', surname='Karleone', year=1977, iq=90,
// mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname='Rock',
// age=5, trickLevel=75, habits=[eat, drink, sleep]}}

    public Pet getPet(){
        return pet;
    }
    public Human getMother(){
        return mother;
    }
    public Human getFather() {
        return father;
    }
    public String toString() {
        return ("Human{name=' " + this.name + " ' , surname=' " + this.surname +" ' , year=" +
                this.dateOfBirthyear + " , iq= " + this.iq + " , \n mother= " + this.mother +
                " , \n father= " + this.father + ", pet =" + this.pet);
    }
    //(greetPet)("Hello, [the name of the pet]")
      //      (describePet): (display the information about your pet: "I have a [species], he is [age] years old, he is [very sly]>50/[almost not sly]<50".
    void greetPet(){
        System.out.println("Hello" + pet.nickname);
    }
    void describePet(){
        System.out.println("I have a " + pet.species+ ", he is " + pet.age + "years old, he is " + pet.trickLevel + " >50/" + pet.trickLevel+ "<50");
    }
}
