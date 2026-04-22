import java.util.Scanner;

public class MatrixSum{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [ ] [ ] matrix = new int[3][3];
        int sum = 0;
        int i,j;
        System.out.println("Enter the elements of the matrix: ") ;
        for ( i =0 ; i<=2; i++){
            for ( j= 0 ; j<=2 ; j++){
                matrix [i][j]=sc.nextInt();

            }
        }
        System.out.println("\n The matrix is : ");
        for (i =0 ; i<=2; i++){
            for ( j= 0 ; j<=2 ; j++){
                System.out.print(matrix[i][j]+" ") ;
                sum+=matrix[i] [j] ;


            }
            System.out.println( );

        }
        System.out.println("The sum of all elements is : " + sum );

        for (i = 0 ; i <=2; i++){

            int rowSum=0;

            for(j=0 ; j<=2 ; j++ ){
                rowSum+=matrix[i][j];
            }
            System.out.println("The Sum of row is "+ (i+1 ) + " "+ rowSum);
        }

        for (j= 0 ; j<=2; j++){

            int colSum=0;

            for(i=0 ; i<=2 ; i++ ){

                colSum+=matrix[i][j];
            }
            System.out.println("The Sum of row is " + (j+1 ) + " "+ colSum);
        }




    }
}