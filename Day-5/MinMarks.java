import java.util.Scanner;
public class MinMarks {
    public static int minMarks(int marks1, int marks2, int marks3, int marks4){
            int min = marks1;
            if(marks2 < min){
                min = marks2;
            }
            if(marks3 < min){
                min = marks3;
            }
            if(marks4 < min){
                min = marks4;
            }
            return min;
        }
    public static void main(String[] args){
        int[] marks = new int[4];
        Scanner sc = new Scanner(System.in);
          for(int i=0; i<4; i++){
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine(); 
        }
        int min = minMarks(marks[0], marks[1], marks[2], marks[3]);
        System.out.println("Minimum Marks: " + min);
        sc.close();
    }
}
