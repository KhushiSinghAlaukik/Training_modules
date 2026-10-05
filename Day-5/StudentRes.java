import java.util.Scanner;

 public class StudentRes {

        public static void BubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args){
        String[] name = new String[4];
        int[] marks = new int[4];
        Scanner sc = new Scanner(System.in);
          for(int i=0; i<4; i++){
            System.out.println("Enter name: ");
            name[i] = sc.nextLine();
            System.out.println("Enter marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine(); 
        }
        char grade;
          for(int i=0; i<4; i++){
            if(marks[i]>=90){
                grade = 'A';
            } else if(marks[i]>=80){
                grade = 'B';
            } else if(marks[i]>=70){
                grade = 'C';
            } else if(marks[i]>=60){
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Name: " + name[i] + ", Marks: " + marks[i] + ", Grade: " + grade);
        }
    }
}
