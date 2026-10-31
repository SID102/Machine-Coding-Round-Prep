public class BuyNowPayLaterService{

    //map to store customer id and trancsaction id mapping 
    private Map<Integer,Customer> idToCustomer;

    //map to store customer to all its transaction 
    private Map<Integer,List<Transaction>> customerTransaction;

    BuyNowPayLaterService(){
        idToCustomer=new HashMap<>();
        customerTransaction=new HashMap<>();
    }

    void registerCustomer(Customer customer){
        System.out.println("registering the customer");
        idToCustomer.put(customer.getCustomerId(),customer);
        System.out.println("customer registered");
    }

}