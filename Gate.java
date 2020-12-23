package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwing;

    public Gate(){}

    public boolean setSwing(int direction){
        if(direction<-1&&direction>1){
            return false;
        }
        mSwing = direction;
        return true;
    }
    public int getSwingDirection(){
        return mSwing;
    }

    public void close(){
        mSwing=CLOSED;
    }

    public boolean open(int direction){
        if(direction==IN||direction==OUT){
            setSwing(direction);
            return true;
        }
        return false;
    }

    public int thru(int count){
        if(mSwing==CLOSED){
            return 0;
        }
        else if(mSwing==IN){
            return count;
        }
        else if(mSwing==OUT){
            return count*-1;
        }
        return 0;
    }

    @Override
    public String toString(){
        if(mSwing==CLOSED){
            return "This gate is closed";
        }
        else if(mSwing==IN){
            return "This gate is open and swings to enter the pen only";
        }
        else if(mSwing==OUT){
            return "This gate is open and swings to exit the pen only";
        }
        return "This gate has an invalid swing direction";
    }
    
}
