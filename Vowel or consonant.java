public class VowelCheck {
    public static void main(String[] args) {
        char ch = 's';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }
}
