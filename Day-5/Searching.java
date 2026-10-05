public class Searching {
    public static int find(int[] arr, int target) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = 1;
                return ans; 
            }
        }
        return ans; 
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        System.out.println(find(arr, target));
    }
}
