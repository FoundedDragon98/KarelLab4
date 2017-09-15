
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        getToEdge();
        checkWall();
    }
    
    public void getToEdge() {
        while(frontIsClear()) {
            move();
        }
        turnLeft();
    }
    
    public void checkWall() {
        if(frontIsClear()) {
            while(frontIsClear()) {
                if(checkRight()) {
                    while(frontIsClear()) {
                        move();
                    }
                    turnOff();
                }
                else {
                    turnLeft();
                    move();
                }
            }
            turnLeft();
            checkWall();
        }
        else {
            turnLeft();
            checkWall();
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public boolean checkRight() {
        turnRight();
        if(frontIsClear()) {
            return true;
        }
        else {
            return false;
        }
    }
}

