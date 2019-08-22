package core.basesyntax;

public class Palindrome {
    public boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        String string = new String(stringBuilder);
        if (text.equals(string)) {
            return true;
        } else {
            return false;
        }
    }
}
