import java.util.Scanner; 
public class IntegerInput {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the integer: ");
        int num = sc.nextInt();  
        System.out.println("Entered integer is: " + num);
        sc.close();  
    }
}
