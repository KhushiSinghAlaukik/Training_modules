import java.util.Scanner;

public class BillCalc {
    public static void main(String[] args){
        System.out.println("Enter the units: ");
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int rate;
        if(units<=100){
            rate = 5;
        }else if(units<=200){
            rate = 10;
        }else if(units<=300){
            rate = 15;
        }else{
            rate = 20;
        }
        int total = units*rate;
        System.out.println("The bill ammount is: " + total+ " Rs." );
        sc.close();
    }
}