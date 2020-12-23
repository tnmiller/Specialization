package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
       extends Building {

    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices=0;

    public Office(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        mBusinessName=null;
        mParkingSpaces=0;
        sTotalOffices+=1;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
        super(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
        mParkingSpaces=0;
        sTotalOffices+=1;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName,
                  int parkingSpaces){
        super(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
        mParkingSpaces=parkingSpaces;
        sTotalOffices+=1;
    }
    public String getBusinessName(){
        return mBusinessName;
    }
    public int getParkingSpaces(){
        return mParkingSpaces;
    }
    public static int getsTotalOffices(){
        return sTotalOffices;
    }
    public void setBusinessName(String s){
        mBusinessName=s;
    }
    public void setParkingSpaces(int p){
        mParkingSpaces = p;
    }
    @Override
    public String toString(){
        return "This office hosts "+getBusinessName()+" with "+getParkingSpaces()+" parking spacees.";
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Office){
            Office otherOffice = (Office) o;
            if(this.calcBuildingArea()==otherOffice.calcBuildingArea()&&this.getParkingSpaces()==otherOffice.getParkingSpaces()){
                return true;
            }
            return false;
        }
        return false;
    }
}
