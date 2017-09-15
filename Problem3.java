 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        while(!nextToABeeper()) {
            if(!checkWallLeft() && !checkWallFront()) {
                turnRight();
            }
            if(checkWallLeft() && checkWallFront()) {
                putBeeper();
                move();
            }
            if(!checkWallLeft() && checkWallFront()) {
                move();
            }
        }
        turnOff();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public boolean checkWallLeft() {
        turnLeft();
        if(frontIsClear()) {
            turnRight();
            return true;
        }
        else {
            turnRight();
            return false;
        }
    }
    
    public boolean checkWallRight() {
        turnRight();
        if(frontIsClear()) {
            turnLeft();
            return true;
        }
        else {
            turnLeft();
            return false;
        }
    }
    
    public boolean checkWallFront() {
        if(frontIsClear()) {
            return true;
        }
        else {
            return false;
        }
    }
}

