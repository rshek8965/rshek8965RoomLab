package Places;

import Game.Runner;
import People.Person;

public class WinningPlace extends Place
{
    private String aList[] = {"some colorful sea glass! but do you really want to carry around garbage?",
            "a fully intact seashell! it's a really ugly color though...",
            "a hermit crab! it pinched you... isn't life a treasure?"};
    private int counter=0;

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
        int random = (int) (Math.random()*3);
        System.out.println("you found " + aList[random]);
        counter+=1;
        System.out.println("you've found " + counter + " treasures so far.");

        if (counter==3) {
            System.out.println("It's getting late, it's time to call it a day and go home.");
            Runner.gameOff();
        }
    }

}
