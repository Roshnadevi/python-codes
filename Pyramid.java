public class pyramid{
    public static void main(String[] args){
        int n=5;
        for (int i=0; i<=n; i++)
        {
            for(int s=-1; s<n-i-1; s++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i*2+1; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}