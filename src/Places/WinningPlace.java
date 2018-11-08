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
        System.out.println("you found a hermit crab! it pinched you... isn't life a treasure?");
        Runner.gameOff();
    }

}
