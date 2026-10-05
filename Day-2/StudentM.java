import java.util.Scanner;

public class StudentM {
    public static int percentage(int marks, int totalMarks){
        return (marks * 100) / totalMarks;
    }
    public static int totalMarks(int marks1, int marks2, int marks3){
        return marks1 + marks2 + marks3;
    }
    public static char grade(int percentage){
        if(percentage >= 90){
            return 'A';
        } else if(percentage >= 80){
            return 'B';
        } else if(percentage >= 70){
            return 'C';
        } else if(percentage >= 60){
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter marks for 3 subjects:");
        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int total = totalMarks(marks1, marks2, marks3);
        int percent = percentage(total, 300);
        char grade = grade(percent);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percent + "%");
        System.out.println("Grade: " + grade);
    }
}
