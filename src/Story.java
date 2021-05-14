import catStory.HomeCat;
import catStory.Master;
import catStory.WildCat;
import java.util.Random;

public class Story
{
    public static void tellStory()
    {
        Random random = new Random();
        Master master = new Master("Denis",1000 + random.nextInt(3000), 20 + random.nextInt(200));
        Master master1 = new Master("Maxim",1000 + random.nextInt(3000), 20 + random.nextInt(200));
        WildCat cat1 = new WildCat("Barsik", "Street Hooligan");
        WildCat cat2 = new WildCat("Markiz", "King of the dark city");
        HomeCat hcat1 = new HomeCat("Lipton", "British", master);
        HomeCat hcat2 = new HomeCat("Winston", "Scottish", master1);
        System.out.println("\n" + cat1.getName() + " " + cat1.getBreed() + ". " + cat2.getName() + " "
                + cat2.getBreed() + ". " + hcat1.getName() + " "
                + hcat1.getBreed() + ". " + hcat2.getName() + " "
                + hcat2.getBreed() + "\n");
        System.out.println("Long ago, the four cats lived together in harmony. " +
                "Then everything changed when the cat " + cat1.getName() + " attacked.\n");
        System.out.println("Only the world's cat savior could stop the villain. " +
                "But when the world needed him the most, he vanished.\n");
        System.out.println("A hundred years passed and people discovered the new world's savior, a cat named " +
                cat2.getName() + ". He still has a lot to learn before he's ready to save anyone.\n");
        System.out.println("But I believe " + cat2.getName() + " can save the world.\n");
        System.out.println("On one of the spring days, two friends named " +
                master.getName()+ " and " + master1.getName() + " received salaries. \n");
        System.out.println(master.getName() + " has been waiting for it for so long because he wanted to buy new sneakers.\n");
        int shoes_cost = random.nextInt(200) + 20;
        System.out.println("Finally " + master.getName() + " has " + master.getUsd() +
                "$, so he went to the store and bought shoes for " + shoes_cost + "$ and " + master1.getName() + "" +
                " did not buy anything for himself." + "\n");
        master.setShoes_cost(shoes_cost);
        System.out.println("At home " + master.getName() + " was waited by " + hcat1.getName() + " the cat" +
                ", and Max was waited by " + hcat2.getName() + ".\n");
        System.out.println(hcat2.getName() + " was not very active, always laying on the sofa.\n");
        hcat2.layOnSofa();
        System.out.println("But " + hcat1.getName() + " on the other hand was so happy to see his master and the " +
                "new sneakers, that he gladly peed on them.\n");
        hcat1.spoilShoes();
        System.out.println(master.getName() + " is a very kind person so he did not punish the cat, " +
                "and just gave him some of his favourite Whiskas instead.\n");
        System.out.println("Meanwhile evil was emerging outside...\n");
        cat1.hatePeople();
        System.out.println("With these words " + cat1.getName() + " started developing plan on destroying " +
                "humans and home cats.\n");
        System.out.println("But he did not know that his time was coming to the end. His plan was uncovered by the " +
                "true hero of this world - cat " + cat2.getName() + ".\n");
        System.out.println("With quiet mewing he lead animal control workers right to " + cat1.getName() + ".\n");
        System.out.println("The villain was taken into custody.\n");
        cat2.saveWorld();
        System.out.println("Glory to the super-cat! " + cat2.getName() + "!\n");
        System.out.println("THE END!");
    }
    public static void main(String[] args)
    {
        Story.tellStory();
    }

}
