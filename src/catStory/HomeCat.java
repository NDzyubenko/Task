package catStory;
public class HomeCat extends Cat {
    private final Master master;

    public HomeCat(String Name, String Breed, Master master) {
        this.Name = Name;
        this.Breed = Breed;
        this.master = master;
    }

    public String getName(){
        return Name;
    }

    public String getBreed(){
        return Breed;
    }

    public void layOnSofa() {
        System.out.println(Name + ": Meow!\n");
    }

    public void spoilShoes() {
        master.decreaseMoney();
    }
}