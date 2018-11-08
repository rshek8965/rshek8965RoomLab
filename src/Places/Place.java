package Places;

import People.Person;

public class Place {
    Person occupant;
    int xLoc,yLoc;

    public Place(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this Place.
     * @param x the Person entering
     */
    public void enterPlace(Person x)
    {
        System.out.println("you don't see anything interesting");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the Place.
     * @param x
     */
    public void leavePlace(Person x)
    {
        occupant = null;
    }

    public String toString()
    {
        String x = "";
        if (occupant != null) {
            x += "X ";
            return x;
        }
        else {
            //x += this.xLoc;
            //x += this.yLoc + " ";
            x += " O ";
            return x;
        }
    }

}
