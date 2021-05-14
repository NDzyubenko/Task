package catStory;
public class HomeCat extends Cat {
    private final Master master;

    public HomeCat(String name, String breed, Master master) {
        this.name = name;
        this.breed = breed;
        this.master = master;
    }

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public void layOnSofa() {
        System.out.println(name + ": Meow!\n");
    }

    public void spoilShoes() {
        master.decreaseMoney();
    }
}