import java.util.Scanner;
public class AvgMarks {
    public static int averageMarks(int marks1, int marks2, int marks3, int marks4){
        int total = marks1 + marks2 + marks3 + marks4;
        return total / 4;
    }
    public static void main(String[] args){
        int[] marks = new int[4];
        Scanner sc = new Scanner(System.in);
          for(int i=0; i<4; i++){
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }
        int avg = averageMarks(marks[0], marks[1], marks[2], marks[3]);
        System.out.println("Average Marks: " + avg);
    }
}
