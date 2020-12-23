package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
       extends House {

    // TODO - Put your code here.
    private boolean mSecondFloor;

    public Cottage(int dimension, int lotLength, int lotWidth){
        super(dimension, dimension, lotLength, lotWidth);
        mSecondFloor=false;
    }
    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor){
        super(dimension, dimension, lotLength, lotWidth, owner);
        mSecondFloor=secondFloor;
    }
    public boolean hasSecondFloor(){
        return mSecondFloor;
    }
    @Override
    public String toString(){
        return "Cottage owned by "+getOwner();
    }
    
}

