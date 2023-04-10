import java.util.Arrays;
import java.util.Scanner;

public class sortstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the number of strings: ");
        int n = input.nextInt();
        
        
        String[] words = new String[n];
        
        
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            words[i] = input.next();
        }

        
        Arrays.sort(words);

        
        System.out.println("Sorted strings:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}


