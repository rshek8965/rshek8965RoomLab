package Game;

import People.Person;
import Places.Place;
import Places.TeleportPlace;
import Places.WinningPlace;

import java.util.Scanner;

public class Runner {


    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        Place[][] floor = new Place[10][10];

        Board map = new Board(10,10);


        //Fill the floor with normal Places
        for (int x = 0; x<floor.length; x++)
        {
            for (int y = 0; y < floor[x].length; y++)
            {
                floor[x][y] = new Place(x,y);
            }
        }

        System.out.println(map);

        //Create a random winning Place.
        int x = (int)(Math.random()*floor.length);
        int y = (int)(Math.random()*floor.length);
        floor[x][y] = new WinningPlace(x, y);

        //Create a random teleport Place.
        int a = (int)(Math.random()*floor.length);
        int b = (int)(Math.random()*floor.length);
        floor[a][b] = new TeleportPlace(a, b);

        //Setup player 1 and the input scanner
        Person player1 = new Person("FirstName", "FamilyName", 0,0);
        floor[0][0].enterPlace(player1);
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Where would you like to move? (Choose a,s,d,w)");
            String move = in.nextLine();
            if(validMove(move, player1, floor))
            {
                System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

            }
            else {
                System.out.println("Please choose a valid move.");
            }


        }
        in.close();
    }

    /**
     * Checks that the movement chosen is within the valid game map.
     * @param move the move chosen
     * @param p person moving
     * @param map the 2D array of Places
     * @return
     */
    public static boolean validMove(String move, Person p, Place[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "w":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leavePlace(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterPlace(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "d":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leavePlace(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterPlace(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leavePlace(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterPlace(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "a":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leavePlace(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterPlace(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }
    public static void gameOff()
    {
        gameOn = false;
    }



}