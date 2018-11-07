package Places;

import Game.Runner;
import People.Person;

public class TeleportPlace extends Place {

    public TeleportPlace(int a, int b) {
        super(a, b);

    }

    /**
     * Triggers the game ending conditions.
     *
     * @param x the Person entering
     */
    @Override
    public void enterPlace(Person x) {

        occupant = x;
        x.setxLoc((int) (Math.random() * 5));
        x.setyLoc((int) (Math.random() * 5));
        System.out.println("You entered a teleportation Place. Your new coordinates are: row = " + x.getxLoc() + " col = " + x.getyLoc());
    }
}
