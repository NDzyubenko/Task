/* Nikita Dziubenko
 *  17.05.2021
 *  This is task #7 for SoftServe's
 *  IT Academy
 *  ROCK BAND HIERARCHY
 */
public class Vocalist extends Human implements BandActions {
    public Vocalist(int hairLength) {
        super(hairLength);
    }

    public void play() {
        System.out.println("Hey aaaaaa, ooooooooooo");
    }

    public void play(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                play();
            } else {
                System.out.println("Maria hi, Maria hu, MARIA HA HA!");
            }
        }
    }
}
