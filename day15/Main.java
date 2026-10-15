package day15;

import java.util.HashMap;
import java.util.Scanner;

class ContactManagement{
    public String name,phoneNo;
    
    public ContactManagement(String name, String phoneNo){
        this.name = name;
        this.phoneNo = phoneNo;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Phone number : "+phoneNo);
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, ContactManagement> map = new HashMap<>();
        
        int choice = 0;
        while(choice!=5){
            System.out.println("Contact Management System: ");
            System.out.println("1. Add contact ");
            System.out.println("2. Search Contact ");
            System.out.println("3. Delete Contact ");
            System.out.println("4. Display Contact ");
            System.out.println("5.Exit ");
            
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name : ");
                    String name = sc.nextLine();
                    System.out.println("Enter phone no. : ");
                    String phoneNo = sc.nextLine();
                    if(map.containsKey(phoneNo)){
                        System.out.println("Phone no. already exists!");
                    }else{
                        ContactManagement contact = new ContactManagement(name, phoneNo);
                        map.put(phoneNo, contact);
                        System.out.println("Contact saved successfully !");
                    }
                    break;
                case 2:
                    System.out.println("Enter phone no. : ");
                    String SearchNo = sc.nextLine();
                    if(map.containsKey(SearchNo)){
                        map.get(SearchNo).display();
                    }else{
                        System.out.println("Contact not found!");
                    }
                    break;
                case 3:
                    System.out.println("Enter phone no. : ");
                    String DeleteNo = sc.nextLine();
                    if(map.containsKey(DeleteNo)){
                        map.remove(DeleteNo);
                        System.out.println("No. Deleted !");
                    }else{
                        System.out.println("The contact dosenot exist !");
                    }
                    break;
                case 4:
                    if(map.isEmpty()){
                        System.out.println("The contact list is empty!");
                    }
                    else{
                        for(ContactManagement c : map.values()){
                            c.display();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting!");
                    break;
                default:
                    System.out.println("Enter valid choice!");
            }
        }
        sc.close();
    } 
}
