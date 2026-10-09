abstract class PaymentService{
    public abstract void paymentProcess();
    public void Display(){
        System.out.println("Payment Successful !!");
    }
}
class UpiPayment extends PaymentService{
    public void paymentProcess(){
        System.out.println("The UPI Payment is processing...");
    }
}
class CardPayment extends PaymentService{
    public void paymentProcess(){
        System.out.println("The Card Payment is processing... ");
    }
}
class NetBanking extends PaymentService{
    public void paymentProcess(){
        System.out.println("The payment throungh Net Banking is processing...");
    }
}
public class Main {
    public static void main(String[] args){
        UpiPayment p1 = new UpiPayment();
        p1.paymentProcess();
        p1.Display();
        System.out.println(" ");
        CardPayment c1 = new CardPayment();
        c1.paymentProcess();
        c1.Display();
        System.out.println(" ");
        NetBanking n1 = new NetBanking();
        n1.paymentProcess();
        n1.Display();
    }
}
