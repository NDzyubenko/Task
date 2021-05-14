package catStory;
public class Master {
    private final String name;
    private int usd;
    private int shoesCost;

    public Master(String name, int usd, int shoesCost) {
        this.shoesCost = shoesCost;
        this.name = name;
        this.usd = usd;
    }

    public int getUsd() {
        return usd;
    }

    public String getName(){
        return name;
    }

    public void decreaseMoney() {
        System.out.println(name + ": Fuck! My " + shoesCost + "$ sneakers! \n");
        usd -= shoesCost;
    }

    public void setShoesCost(int shoesCost){
        this.shoesCost = shoesCost;
    }

    public int getShoesCost(){
        return shoesCost;
    }
}
