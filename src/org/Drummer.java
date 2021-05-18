/* Nikita Dziubenko
 *  17.05.2021
 *  This is task #7 for SoftServe's
 *  IT Academy
 *  ROCK BAND HIERARCHY
 */
package org;

public class Drummer extends Human implements BandActions {
  public Drummer(int hairLength) {
    super(hairLength);
  }

  public String getMembersName() {
    return "Maxim";
  }

  public void play() {
    System.out.println("bd bd bd bd bd tssssss");
  }

  public void play(String sound) {
    System.out.println(sound);
  }
}
