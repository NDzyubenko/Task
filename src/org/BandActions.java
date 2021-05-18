/* Nikita Dziubenko
 *  17.05.2021
 *  This is task #7 for SoftServe's
 *  IT Academy
 *  ROCK BAND HIERARCHY
 */
package org;

public interface BandActions {
    int MEMBERS_AMOUNT = 4;

    static int getMembersAmount() {
        return MEMBERS_AMOUNT;
    }

    void play();

    default void drinkBeer() {
        System.out.println("mmmmm, yummy bear");
    }
}
