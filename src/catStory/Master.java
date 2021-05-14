package catStory;
public class Master {
    private String Name;
    private int usd;
    private int shoes_cost;

    public Master(String Name, int usd, int shoes_cost) {
        this.shoes_cost = shoes_cost;
        this.Name = Name;
        this.usd = usd;
    }

    public int getUsd() {
        return usd;
    }

    public String getName(){
        return Name;
    }

    public void decreaseMoney() {
        System.out.println(Name + ": Fuck! My " + shoes_cost + "$ sneakers! \n");
        usd -= shoes_cost;
    }

    public void setShoes_cost(int shoes_cost){
        this.shoes_cost = shoes_cost;
    }

    public int getShoes_cost(){
        return shoes_cost;
    }
}
