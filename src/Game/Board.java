package Game;

import Places.Place;

public class Board {
    Place[][] map;

    public Board(Place[][] map) {
        this.map = map;
    }

    public Board(int height, int width) {
        map = new Place[height][width];
    }

    public void addPlace(Place Place, int row, int col)
    {
        map[row][col]=Place;
    }

    public String toString() {
        String x = "";
        for (Place[] i : map) {
            for (Place j : i) {
                x+=j;
            }
            x+="\n";
        }
        return x;
    }

    public void printBoard()
    {
        for(Place[] i : map)
        {
            for(Place j : i)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

