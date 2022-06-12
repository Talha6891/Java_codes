 class palidrome {
    
    import java.util.Scanner;

class prime_number {

    public static void main(String[] args) {
        
    int num , digit; //to take from user.
    int reverse = 0;   //to store reverse value.
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int  temp = num;  // temp = temporaray store "num" value.
        while(num > 0){  

        digit = num % 10;

        reverse = (reverse * 10) + digit;

        num = num/10;
        }
    System.out.println();
    System.out.print("Reverse number: " + reverse);

    if (temp == reverse) {
        System.out.println("Number is palidrome. ");
    }
    else{
        System.out.println("Number is not  palidrome. ");
    }
    }
    
}

}
