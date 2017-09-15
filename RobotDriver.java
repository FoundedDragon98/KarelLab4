
import kareltherobot.*;
import java.awt.Color;

public class RobotDriver implements Directions
{
    public static void main(String args[])  {
        BeeperBot billy = new BeeperBot(1,1,East,0);
        billy.runRace();
        billy.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/beeper_steeple.kwld");
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(8);  
        World.setVisible(true);
    }
}