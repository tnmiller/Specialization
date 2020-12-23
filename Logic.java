package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;
    private int ADD=1;
    private int SUB=2;
    private int MULTI=3;
    private int DIV=4;
    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        if(operation==ADD){
            int temp = argumentOne+argumentTwo;
            String s = String.valueOf(temp);
            mOut.print(s);
        }
        else if(operation==SUB){
            int temp = argumentOne-argumentTwo;
            String s = String.valueOf(temp);
            mOut.print(s);
        }
        else if(operation==MULTI){
            int temp = argumentOne*argumentTwo;
            String s = String.valueOf(temp);
            mOut.print(s);
        }
        else if(operation==DIV){
            int temp1 = argumentOne/argumentTwo;
            int temp2 = argumentOne%argumentTwo;
            String s = String.valueOf(temp1)+" R"+String.valueOf(temp2);
            mOut.print(s);
        }
    }
}
