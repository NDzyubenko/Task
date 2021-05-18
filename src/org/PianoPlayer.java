/* Nikita Dziubenko
 *  17.05.2021
 *  This is task #7 for SoftServe's
 *  IT Academy
 *  ROCK BAND HIERARCHY
 */
package org;

public class PianoPlayer extends Human implements BandActions {
    public PianoPlayer(int hairLength) {
        super(hairLength);
    }

    public void play() {
        System.out.println("pam pam pam pam");
    }

    public void play(String pianoSound, int countSound) {
        for (int i = 0; i < countSound; i++) {
            System.out.println(pianoSound);
        }
    }
}
