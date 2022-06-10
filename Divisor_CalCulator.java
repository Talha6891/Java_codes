import java.util.Scanner;

class Divisor_CalCulator {

// To check on which numbers it is divisible.
public static void main(String[] args) {
        int num;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int divisor=1;
         int count;

        while (num >= divisor && num!=0){
            if(num % divisor == 0){
                System.out.print(divisor +" ");    
            }
            divisor++;

        }
    }
}


