 

import kareltherobot.*;
import java.awt.Color;

public class Problem2Driver implements Directions
{
    public static void main(String args[])  {
        Problem2 sally = new Problem2(5,5,East,-1);
        sally.plantBeepers();
        sally.turnOff();
        
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig6-19.kwld");
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}