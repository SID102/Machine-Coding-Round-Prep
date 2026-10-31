public class Transaction{

    private final String transactionId;

    private final Integer customerId;

    private final Integer amount;

    private final Instant timestamp;

    private final String type;

    Transaction(String transactionId,Integer customerId,Integer amount,Instant timestamp,String type){
        this.transactionId=transactionId;
        this.customerId=customerId;
        this.amount=amount;
        this.timestamp=timestamp;,
        dkddk
        this.type=type;
    }
}