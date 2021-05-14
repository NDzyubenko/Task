package catStory;

public class WildCat extends Cat {

    public WildCat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public void hatePeople() {
        System.out.println(name + ": Oh, how I hate people with their home cats! \n");
    }

    public void saveWorld() {
        System.out.println("Cat " + name + " saved the world!\n");
    }
}