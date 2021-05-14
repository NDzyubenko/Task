package catStory;

import java.util.Random;

public class Story extends tellParts {


    public static void main(String[] args) {

        Random random = new Random();
        Master firstMaster =
                new Master("Denis", 1000 + random.nextInt(3000), 20 + random.nextInt(200));
        Master secondMaster =
                new Master("Maxim", 1000 + random.nextInt(3000), 20 + random.nextInt(200));
        WildCat badCat = new WildCat("Barsik", "Street Hooligan");
        WildCat heroCat = new WildCat("Markiz", "King of the dark city");
        HomeCat firstHomeCat = new HomeCat("Lipton", "British", firstMaster);
        HomeCat secondHomeCat = new HomeCat("Winston", "Scottish", secondMaster);
        int shoesCost = random.nextInt(200) + 20;
        System.out.println(
                "\n"
                        + badCat.getName()
                        + " "
                        + badCat.getBreed()
                        + ". "
                        + heroCat.getName()
                        + " "
                        + heroCat.getBreed()
                        + ". "
                        + firstHomeCat.getName()
                        + " "
                        + firstHomeCat.getBreed()
                        + ". "
                        + secondHomeCat.getName()
                        + " "
                        + secondHomeCat.getBreed()
                        + "\n");
        Story.tellFirstPart(badCat.getName(), heroCat.getName());
        Story.tellSecondPart(
                firstMaster.getName(),
                secondMaster.getName(),
                firstMaster.getUsd(),
                shoesCost,
                firstHomeCat.getName(),
                secondHomeCat.getName());
        secondHomeCat.layOnSofa();
        firstMaster.setShoesCost(shoesCost);
        Story.tellAboutPeed(firstHomeCat.getName());

        firstHomeCat.spoilShoes();
        Story.tellThirdPart(firstMaster.getName());
        badCat.hatePeople();
        finalPart(badCat.getName(), heroCat.getName());
        heroCat.saveWorld();
        Story.epilog(heroCat.getName());
    }
}
