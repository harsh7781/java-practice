package BasicJavaCodes;

import java.util.Scanner;

public class NoOfCharLinesWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text (Press Enter twice to end input):");
        StringBuilder text = new StringBuilder();
        String line;
        while (true) {
            line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            text.append(line).append("\n");
        }
        analyzeText(text.toString());
    }

    public static void analyzeText(String text) {
        String[] lines = text.split("\n");
        int lineCount = lines.length;

        String[] words = text.split("\\s+");
        int wordCount = words.length;

        int charCount = text.length();

        System.out.println("Text Analysis:");
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}
