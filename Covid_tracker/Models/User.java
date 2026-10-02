package Covid_tracker.Models;

public class User{

    private final long phoneNumber;
    private final String passWord;
    private final Role role;
    private final int pincode;

    public User(long phoneNumber,String passWord,Role role,int pincode){
        this.phoneNumber=phoneNumber;
        this.passWord=passWord;
        this.role=role;
        this.pincode=pincode;
    }

    public long getPhoneNumer(){
        return this.phoneNumber;
    }

    public String getPassWord(){
        return this.passWord;
    }

    public Role getRole(){
        return this.role;
    }

    public int getPinCode(){
        return this.pincode;
    }
}
