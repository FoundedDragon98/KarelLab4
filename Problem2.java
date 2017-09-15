
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while(!nextToABeeper()) {
            if(checkWallLeft() && checkWallRight() && checkWallFront()) {
                jumpTurnLeft();
            }
            if(!checkWallLeft() && checkWallRight() && !checkWallFront()) {
                turnRight();
            }
            if(!checkWallLeft() && checkWallRight() && checkWallFront()) {
                putBeeper();
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
    
    public void jumpTurnLeft() {
        turnLeft();
        putBeeper();
        move();
        turnLeft();
        putBeeper();
        move();
    }
}

