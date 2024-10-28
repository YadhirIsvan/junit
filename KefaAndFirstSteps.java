import java.util.Scanner;
 
public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt();
        int[] arr = new int[n];   
 
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
 
        int maxLength = 1; 
        int currentLength = 1;
 
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength); 
        }
 
        System.out.println(maxLength); 
    }
}