/* Nikita Dziubenko
 *  17.05.2021
 *  This is task #7 for SoftServe's
 *  IT Academy
 *  ROCK BAND HIERARCHY
 */
package org;

public class GuitarPlayer extends Human implements BandActions {
    public GuitarPlayer(int hairLength) {
        super(hairLength);
    }

    public void play() {
        System.out.println("dzzzzzzzz dzzzzzz dzzzzzzzzzzz");
    }

    public void play(int n) {
        for (int i = 0; i < n; i++) {
            play();
        }
    }
}
