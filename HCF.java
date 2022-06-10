import java.util.Scanner;

class HCF {
public static void main(String[] args) {
    

    int num1, num2,hcf =0;
    System.out.println("Enter number1: ");
    Scanner sc =new Scanner(System.in);
    num1 = sc.nextInt();
    System.out.println("Enter number2: ");
    num2 = sc.nextInt();

    for(int i= 1; i <= num1 || i <= num2; i++){

        if(num1 % i ==0 && num2 % i==0){
        hcf = i;
        }
        
    }
    System.out.println("HCF of two numbers is: "+ hcf);
}
}
