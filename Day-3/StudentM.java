import java.util.Scanner;
public class StudentM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter marks of 5 subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();    
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = (total / 500.0) * 100;
        char grade;
        if(percentage >= 90){
            grade = 'A';
        } else if(percentage >= 80){
            grade = 'B';
        } else if(percentage >= 70){
            grade = 'C';
        } else if(percentage >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }
       
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

         if(grade == 'F'){
            System.out.println("Student failed.");
        } else {
            System.out.println("Student passed.");
        }
        sc.close();
    }
}
