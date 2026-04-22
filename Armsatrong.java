import java.lang.Math;
public class Armsatrong {
    public static void main(String [] args){
        int i;
        for(i = 1; i<=1000 ; i++){
            int num = i;
            int temp = num;
            int count = 0;
            int sum = 0;
             while(temp> 0){
                 count++;
                 temp = temp/10;

             }
             temp = num;
             while (temp >0){
                 int digit = temp %10;
                 sum +=(int) Math.pow(digit ,  count) ;
                 temp = temp /10 ;

             }
             if (sum == num)
                                System.out.println(num);
        }

    }
}
