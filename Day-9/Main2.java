class PaymentSer{
    public double amount;
    public String paymentID;

    public PaymentSer(double amount, String paymentID){
        this.amount = amount;
        this.paymentID = paymentID;
    }

    public void processPayment(){
        System.out.println("Processing payment !!");
    }
    public void DisplayPayment(){
        System.out.println("The payment amount is: "+amount);
        System.out.println("The Payment ID is: "+paymentID);
    }
}

class UPI extends PaymentSer{
    public UPI(double amount, String paymentID){
        super(amount, paymentID);
    }
    @Override 
    public void processPayment(){
        System.out.println("UPI Payment is being processed of ammount: "+amount);
        System.out.println("UPI payment successful !!");
    }
}
class Card extends PaymentSer{
    public Card(double amount, String paymentID){
        super(amount, paymentID);
    }
    @Override 
    public void processPayment(){
        System.out.println("Card payment is being processed of ammount: "+amount);
        System.out.println("Card payment Successful !!");
    }
}

class Cash extends PaymentSer{
    public Cash(double amount, String paymentID){
        super(amount, paymentID);
    }
    @Override 
    public void processPayment(){
        System.out.println("Cash payment is being processed of ammount: "+amount);
        System.out.println("Cash payment Successful !!");
    }
}

public class Main2 {
    public static void main(String[] args){
        PaymentSer payment;
        payment = new UPI(50000, "BS4578AC");
        payment.DisplayPayment();
        payment.processPayment();
        System.out.println(" ");
        payment = new Card(40000, "PL3677WC");
        payment.DisplayPayment();
        payment.processPayment();
        System.out.println(" ");
        payment = new Cash(60000, "DF3798OL");
        payment.DisplayPayment();
        payment.processPayment();
    }    
}
