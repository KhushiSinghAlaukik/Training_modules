import java.util.Scanner;
public class MaxMarks {
    public static int maxMarks(int marks1, int marks2, int marks3, int marks4){
            int max = marks1;
            if(marks2 > max){
                max = marks2;
            }
            if(marks3 > max){
                max = marks3;
            }
            if(marks4 > max){
                max = marks4;
            }
            return max;
        }
    public static void main(String[] args){
        int[] marks = new int[4];
        Scanner sc = new Scanner(System.in);
          for(int i=0; i<4; i++){
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }
        int max = maxMarks(marks[0], marks[1], marks[2], marks[3]);
        System.out.println("Maximum Marks: " + max);
    }
}
