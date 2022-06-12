import java.util.Scanner;

class reverse_number {

    public static void main(String[] args) {
        
    int num , digit; //to take from user.
    int reverse = 0;   //to store reverse value.
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        while(num > 0){  

        digit = num % 10;

        reverse = (reverse * 10) + digit;

        num = num/10;
        }
    System.out.println();
    System.out.print("Reverse number: " + reverse);
    }
    
}
