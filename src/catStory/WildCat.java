package catStory;

public class WildCat extends Cat {

    public WildCat(String Name, String Breed) {
        this.Name = Name;
        this.Breed = Breed;
    }

    public String getName(){
        return Name;
    }

    public String getBreed(){
        return Breed;
    }

    public void hatePeople() {
        System.out.println(Name + ": Oh, how I hate people with their home cats! \n");
    }

    public void saveWorld() {
        System.out.println("Cat " + Name + " saved the world!\n");
    }
}