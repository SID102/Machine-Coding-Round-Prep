public class Customer{

    private final Integer customerId;
    private Integer creditLimit;
    private Integer outstandingBalance;

    Customer(int customerId,int creditLimit){
        this.customerId=customerId;
        this.creditLimit=creditLimit;
    }

    boolean addOutstanding(int value){
        if(value<0){
            System.out.println("Invalid value");
            return false;
        }
        if(value>(this.creditLimit-this.outstandingBalance)){
            System.out.println("Insuffeicient balance");
            return false;
        }
        this.outStandingBalance+=value;
        System.out.println("Added outstanding of"+value);
        return true;
    }

    boolean payOutstanding(int value){
        if(value<0){
            System.out.println("Invalid value");
            return false;
        }
        if(value>this.outStandingBalance){
            System.out.println("amount greater than current outstanding");
            return false;
        }
        if(this.outStandingBalance==0){
            System.out.println("No current outstanding");
            return false;
        }
        this.outStandingBalance-=value;
        return true;
    }

    boolean increaseCreditLimit(int value){
        if(value<0){
            System.out.println("Invalid value");
            return false;
        }
        this.creditLimit+=value;
        return true;
    }

    int getCustomerId(){
        return this.customerId;
    }
}