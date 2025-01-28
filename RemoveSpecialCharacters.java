public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String input = "He@llo#Wor!ld$123";
        String result = input.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Original String: " + input);
        System.out.println("String after removing special characters: " + result);
    }
}
