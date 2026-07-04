import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for the Array : ");
        for(int i = 0 ; i<7 ; i++){
            arr[i] = sc.nextInt();
        }
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the target : ");
        int target = n.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1 ; j < arr.length;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(" [ " + i + " , " +  j + " ] ");
                    return;
                    
                }
            }
        }
    }
}
