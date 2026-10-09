interface Notifications{
    public void Notify();
}
class Email implements Notifications{
    public void Notify(){
        System.out.println("Notification from Email !");
    }
}
class SMS implements Notifications{
    public void Notify(){
        System.out.println("SMS Recieved !");
    }
}
class Whatsapp implements Notifications{
    public void Notify(){
        System.out.println("Notification from WhatsApp !");
    }
}

public class Main2 {
    public static void main(String[] args){
        Email e1 = new Email();
        e1.Notify();
        System.out.println(" ");
        SMS s1 = new SMS();
        s1.Notify();
        System.out.println(" ");
        Whatsapp w1 = new Whatsapp();
        w1.Notify();
    }
}
