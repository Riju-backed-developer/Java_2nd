import java.util.Scanner;

public class Prime {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth value : ");
        int n;
        n = sc.nextInt( ) ;
        for (int i=2 ; i<= n ; i++)
        {
            int c= 0 ;
            for (int j = 1 ; j<= i ; j++){
                if(i%j == 0)
                   c++;
            }
            if (c==2 )
                System.out.println(i +" ");
        }
    }
}
