package Covid_tracker.Models;

public class CovidRecord{

    private final long userId;
    boolean isCovidPositive;

    public CovidRecord(long userId,boolean isCovidPositive){
        this.userId=userId;
        this.isCovidPositive=isCovidPositive;
    }

    public long getUserId(){
        return this.userId;
    }

    public boolean isCovidPositive(){
        return this.isCovidPositive;
    }

    public void setCovidPositive(boolean isCovidPositive){
        this.isCovidPositive=isCovidPositive;
    }

}
