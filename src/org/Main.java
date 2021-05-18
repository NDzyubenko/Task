/* Nikita Dziubenko
 *  17.05.2021
 *  This is task #7 for SoftServe's
 *  IT Academy
 *  ROCK BAND HIERARCHY
 */
package org;

public class Main {
    public static void main(String[] args) {

        Drummer drummer = new Drummer(17);
        Vocalist vocalist = new Vocalist(22);
        GuitarPlayer guitarPlayer = new GuitarPlayer(50);
        PianoPlayer pianoPlayer = new PianoPlayer(12);
        System.out.println(
                "Once upon a time one not very famous rock band got together. \n"
                        + BandActions.MEMBERS_AMOUNT
                        + " friends started an evening by drinking some beer.");
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
                "It was "
                        + guitarPlayer.getHairLength()
                        + " cm in the beginning. But by the end it has become ");
        guitarPlayer.setHairLength(69);
        guitarPlayer.printHairLength();
        System.out.println(
                "All other's stayed the same:\n"
                        + "Drummer - "
                        + drummer.getHairLength()
                        + " cm\n"
                        + "Vocalist - "
                        + vocalist.getHairLength()
                        + " cm\n"
                        + "Piano player - "
                        + pianoPlayer.getHairLength()
                        + " cm\n");
    }
}
