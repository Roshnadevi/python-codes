public class Armstrong {
    public static void main(String[] args) {
        int num = 259, sum = 0, temp = num;
        while (temp != 0) {
            sum += Math.pow(temp % 10, 3);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
