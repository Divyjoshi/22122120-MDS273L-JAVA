import java.io.*;
import java.util.*;

public class FileAnalyzer {

    public static void main(String[] args) {
        
        String filename = "text.txt"; 
        File file = new File(filename);
        Map<Character, Integer> vowelsCount = new HashMap<>();
        Map<Character, Integer> digitsCount = new HashMap<>();
        Map<String, Integer> wordsCount = new HashMap<>();
        Map<Character, Integer> charsCount = new HashMap<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (Character.isLetter(c)) {
                        char lowercase = Character.toLowerCase(c);
                        if (lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u') {
                            vowelsCount.put(lowercase, vowelsCount.getOrDefault(lowercase, 0) + 1);
                        }
                        charsCount.put(lowercase, charsCount.getOrDefault(lowercase, 0) + 1);
                    } else if (Character.isDigit(c)) {
                        digitsCount.put(c, digitsCount.getOrDefault(c, 0) + 1);
                        charsCount.put(c, charsCount.getOrDefault(c, 0) + 1);
                    }
                }

                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
                }
            }

            scanner.close();

            // Vowels and their count
            System.out.println("Vowels and their count:");
            System.out.println(vowelsCount);

            // Digits and their count
            System.out.println("Digits and their count:");
            System.out.println(digitsCount);

            // Top Five repeated words and their count
            System.out.println("Top Five repeated words and their count:");
            List<Map.Entry<String, Integer>> wordsList = new ArrayList<>(wordsCount.entrySet());
            wordsList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
            for (int i = 0; i < 5 && i < wordsList.size(); i++) {
                System.out.println(wordsList.get(i));
            }

            // Least Five repeated words and their count
            System.out.println("Least Five repeated words and their count:");
            wordsList.sort(Map.Entry.comparingByValue());
            for (int i = 0; i < 5 && i < wordsList.size(); i++) {
                System.out.println(wordsList.get(i));
            }

            // Top Five repeated characters and their count
            System.out.println("Top Five repeated characters and their count:");
            List<Map.Entry<Character, Integer>> charsList = new ArrayList<>(charsCount.entrySet());
            charsList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
            for (int i = 0; i < 5 && i < charsList.size(); i++) {
                System.out.println(charsList.get(i));
            }

            // Least Five repeated characters and their count
            System.out.println("Least Five repeated characters and their count:");
            charsList.sort(Map.Entry.comparingByValue());
            for (int i = 0; i < 5 && i < charsList.size(); i++) {
                System.out.println(charsList.get(i));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}
