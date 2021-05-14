package catStory;

public class tellParts {
    public static void tellFirstPart(String badCatName, String goodCatName) {
        System.out.println(
                "Long ago, the four cats lived together in harmony. "
                        + "Then everything changed when the cat "
                        + badCatName
                        + " attacked.\n");
        System.out.println(
                "Only the world's cat savior could stop the villain."
                        + " But when the world needed him the most, he vanished.\n");
        System.out.println(
                "A hundred years passed and people discovered the new"
                        + " world's savior, a cat named "
                        + goodCatName
                        + ". He still has a lot to learn before he's ready to save anyone.\n");
        System.out.println("But I believe " + goodCatName + " can save the world.\n");
    }

    public static void tellSecondPart(
            String firstMaster,
            String secondMaster,
            int firstMasterSalary,
            int shoesCost,
            String firstHCat,
            String secondHCat) {
        System.out.println(
                "On one of the spring days, two friends named "
                        + firstMaster
                        + " and "
                        + secondMaster
                        + " received salaries. \n");
        System.out.println(
                firstMaster
                        + " has been waiting for it for so long"
                        + " because he wanted to buy new sneakers.\n");
        System.out.println(
                "Finally "
                        + firstMaster
                        + " has "
                        + firstMasterSalary
                        + "$, so he went to the store and bought shoes for "
                        + shoesCost
                        + "$ and "
                        + secondMaster
                        + " did not buy "
                        + "anything for himself."
                        + "\n");
        System.out.println(
                "At home "
                        + firstMaster
                        + " was waited by "
                        + firstHCat
                        + " the cat"
                        + ", and "
                        + secondMaster
                        + " was waited by "
                        + secondHCat
                        + ".\n");
        System.out.println(secondHCat + " was not very active, always laying on the sofa.\n");
    }

    public static void tellAboutPeed(String firstHcat) {
        System.out.println(
                "But "
                        + firstHcat
                        + " on the other hand was so happy to see his master and the "
                        + "new sneakers, that he gladly peed on them.\n");
    }

    public static void tellThirdPart(String firstMaster) {
        System.out.println(
                firstMaster
                        + " is a very kind person so he did not punish the cat, "
                        + "and just gave him some of his favourite Whiskas instead.\n");
        System.out.println("Meanwhile evil was emerging outside...\n");
    }

    public static void finalPart(String badCatName, String goodCatName) {
        System.out.println(
                "With these words "
                        + badCatName
                        + " started developing plan on destroying "
                        + "humans and home cats.\n");
        System.out.println(
                "But he did not know that his time was coming to the end. His plan was uncovered by the "
                        + "true hero of this world - cat "
                        + goodCatName
                        + ".\n");
        System.out.println(
                "With quiet mewing he lead animal control workers right to " + badCatName + ".\n");
        System.out.println("The villain was taken into custody.\n");
    }

    public static void epilog(String goodCatName) {
        System.out.println("Glory to the super-cat! " + goodCatName + "!\n");
        System.out.println("THE END!");
    }
}
