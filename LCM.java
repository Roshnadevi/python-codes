public class LCM {
    public static void main(String[] args) {
        int num1 = 3, num2 = 259;
        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
    public static int findLCM(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
