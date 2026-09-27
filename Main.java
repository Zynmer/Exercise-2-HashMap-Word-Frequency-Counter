import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.toLowerCase().split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String x : words) {
            if (wordCount.containsKey(x)) {
                wordCount.put(x, wordCount.get(x) + 1);
            } else {
                wordCount.put(x, 1);
            }
        }

        System.out.println("Word Frequencies: ");
        for (String x : wordCount.keySet()) { 
            System.out.println( x + ": " + wordCount.get(x)); 
        }

        scanner.close();
    }
}
