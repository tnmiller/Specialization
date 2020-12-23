package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here
    public void setCorralGates(Gate[] gate, Random rand){
        for(Gate item : gate) {
            int s = rand.nextInt(2) - 1;
            item.setSwing(s);
            mOut.println(item.toString());
        }
    }
    public boolean anyCorralAvailable(Gate[] corral){
        for(Gate item:corral){
            if(item.getSwingDirection()==1){
                return true;
            }
        }
        return false;
    }

    public int corralSnails(Gate[] corral, Random rand){
        int snails = 5;
        while(snails>0){
            int x = rand.nextInt(snails-1);
            snails-=x;
            mOut.println(x+"snails have left the pasture and entered through the gate");
        }
    }
}
