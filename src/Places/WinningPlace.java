package Places;

import Game.Runner;
import People.Person;

public class WinningPlace extends Place
{

    public WinningPlace(int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterPlace(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the winning Place! Ten points for Gryffindor.");
        Runner.gameOff();
    }

}
