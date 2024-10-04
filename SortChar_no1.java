import java.util.Scanner;

public class SortChar_no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of words: ");
        String input = scanner.nextLine();

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    vowels.append(c);
                } else {
                    consonants.append(c);
                }
            }
        }

        System.out.println("Vowel Characters: " + vowels);
        System.out.println("Consonant Characters: " + consonants);
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
