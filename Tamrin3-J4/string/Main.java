package string;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String text = scanner.nextLine();
        try {
            System.out.println(checkString(text));
        } catch (NumberInStringException e) {
            System.out.println(e.getMessage());
        }
    }

    static int checkString(String text) throws NumberInStringException {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                throw new NumberInStringException("Enterd Text Has A Digit!");
            }
        }
        return text.length();
    }
}
