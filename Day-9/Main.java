class Payment{
    public void Display(double ammount){
        System.out.println("The payment is made of Rs. "+ammount);
    }
}

class CashPayment extends Payment{
    public void Display(double ammount){
        System.out.println("The Cash Payment is made of Rs. "+ammount);
    }
}

class CardPayment extends Payment{
    public void Display(double ammount){
        System.out.println("The card payment is made of Rs. "+ammount);
    }
}

class UPIpayment extends Payment{
    public void Display(double ammount){
        System.out.println("The UPI Payment is made of Rs. "+ammount);
    }
}
public class Main {
    public static void main(String[] args){
        Payment p1 = new CashPayment();
        Payment p2 = new CardPayment();
        Payment p3 = new UPIpayment();
        p1.Display(5000.0);
        p2.Display(6000.0);
        p3.Display(7000.0);
    }
}
