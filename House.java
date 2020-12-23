package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
       extends Building {

    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        mOwner=null;
        mPool=false;
    }

    public House (int length, int width, int lotLength, int lotWidth, String owner){
        super(length, width, lotLength, lotWidth);
        mOwner=owner;
        mPool=false;
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool){
        super(length, width, lotLength, lotWidth);
        mOwner=owner;
        mPool=pool;
    }
    public String getOwner(){
        return mOwner;
    }
    public boolean hasPool(){
        return mPool;
    }
    public void setOwner(String s){
        mOwner=s;
    }
    public void setPool(boolean b){
        mPool=b;
    }
    @Override
    public String toString(){
        String ans = "Owner: "+mOwner;
        if(mPool){
            ans+="; has a pool";
        }
        if(calcLotArea()-calcBuildingArea()>10){
            ans+="; has big open space";
        }
        return ans;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof House){
            House otherHouse = (House) o;
            if(this.calcBuildingArea()==otherHouse.calcBuildingArea()&&this.hasPool()==otherHouse.hasPool()){
                return true;
            }
            return false;
        }
        return false;
    }
}
