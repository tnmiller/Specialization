package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    // TODO - Put your code here.
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    public Building(int length, int width, int lotLength, int lotWidth){
        mLength=length;
        mWidth=width;
        mLotLength=lotLength;
        mLotWidth=lotWidth;
    }

    public int getLength(){
        return mLength;
    }
    public int getWidth(){
        return mWidth;
    }
    public int getLotLength(){
        return mLotLength;
    }
    public int getLotWidth(){
        return mLotWidth;
    }
    public void setLength(int l){
        mLength=l;
    }
    public void setWidth(int w){
        mWidth=w;
    }
    public void setLotLength(int ll){
        mLotLength = ll;
    }
    public void setLotWidth(int lw){
        mLotWidth = lw;
    }
    public int calcBuildingArea(){
        return mLength*mWidth;
    }
    public int calcLotArea(){
        return mLotWidth*mLotLength;
    }
    @Override
    public String toString(){
        return "A "+mLength+"x"+mWidth+" building";
    }
}
