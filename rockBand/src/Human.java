/* Nikita Dziubenko
 *  17.05.2021
 *  This is task #7 for SoftServe's
 *  IT Academy
 *  ROCK BAND HIERARCHY
 */
public class Human {
    int hairLength;

    public Human(int hairLength) {
        this.hairLength = hairLength;
    }

    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }

    int getHairLength() {
        return hairLength;
    }

    public void printHairLength() {
        System.out.println(hairLength);
    }

    public static void main(String[] args) {
        Drummer drummer = new Drummer(17);
        Vocalist vocalist = new Vocalist(22);
        GuitarPlayer guitarPlayer = new GuitarPlayer(50);
        PianoPlayer pianoPlayer = new PianoPlayer(0);
        System.out.println(
                "Once upon a time one not very famous rock band got together. "
                        + "They started an evening by drinking some beer.");
        drummer.drinkBeer();
        vocalist.drinkBeer();
        guitarPlayer.drinkBeer();
        pianoPlayer.drinkBeer();
        System.out.println("And then they started playing:");
        drummer.play();
        vocalist.play();
        guitarPlayer.play();
        pianoPlayer.play();
        drummer.play("Badums-Badums-Badums");
        vocalist.play(3);
        guitarPlayer.play(4);
        pianoPlayer.play("pom, pom, tin, tin, ou, ou", 3);
        System.out.println("The guitar player was working so hard that his hair got even longer ");
        System.out.print(
                "When they started it was "
                        + guitarPlayer.getHairLength()
                        + " cm but in the end it was ");
        guitarPlayer.setHairLength(69);
        guitarPlayer.printHairLength();
    }
}
