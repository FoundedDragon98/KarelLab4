
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while(frontIsClear()) {
            collectBeeperSteeple();
        }
    }
    
    public void collectBeeperSteeple() {
        findBeepers();
    }
    
    public void findBeepers() {
        faceEast();
        while(!nextToABeeper()) {
            move();
            if(nextToABeeper()) {
                collectCollumn();
            }
        }
    }
    
    public void collectCollumn() {
        faceNorth();
        while(nextToABeeper()) {
            pickBeeper();
            move();
        }
        faceSouth();
        while(frontIsClear()) {
            move();
        }
        faceEast();
    }
    
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    
    public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }
    
    public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
}