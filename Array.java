// WAP in java to create and initialize an ID integer array with numbers from 1 to 100
//then print the array elements using print_array method.
public class Array {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i<100; i++){
            array[i] = i+1;
        }
        PrintArray(array) ;
    }

    public static void PrintArray(int[] array){
        System.out.println("Printing array.");
        for(int i = 0; i<100; i++){
            if ((i ) % 10== 0) {
                System.out.println( ) ;
            }
            System.out.print(array[i] + " ");
        }
    }
}
