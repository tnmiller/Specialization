package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mWestGate;

    /**
     * The output Gate object.
     */
    private Gate mEastGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;
    public static final int HERD = 24;
    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // TODO -- Fill your code in here
    public void simulateHerd(Random rand){
        int inside = HERD;
        int gate = 0; //west=0, east=1
        for(int i=0;i<10;i++){
            mOut.println("There are currently "+inside+" snails in the pen and "+(HERD-inside)+" snails in the pasture");
            int whichGate = rand.nextInt(1);
            if(inside==24){
                whichGate=1;
            }
            if(inside==0){
                whichGate=0;
            }
            int howMany = rand.nextInt(24);
            if(whichGate==1){
                inside-=howMany;
            }
            else if(whichGate==0){
                inside+=howMany;
            }
        }
    }
    
}
