import java.util.Scanner;
public class Sorting {
    public static void bubbleSort(int[] arr) {
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
        int[] marks = new int[4];
        Scanner sc = new Scanner(System.in);
          for(int i=0; i<4; i++){
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }
        bubbleSort(marks);
        System.out.println("Sorted Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        sc.close();
    }   
}
