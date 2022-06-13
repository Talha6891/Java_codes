import java.util.Scanner;

import javax.xml.transform.Templates;

class spy_number{

    void spy_check(int num){
        int number = num, last_digit;
        int sum= 0;
        int product = 1;
int temp = number;
        
        while(number > 0){
            last_digit = number % 10; //to find last digit

            sum += last_digit;
            product *= last_digit;
            number /= 10;   // to move on next integer.
        }        
        if(sum == product){
            System.out.println("Number is spy " + temp);
        }
        else{
            System.out.println("Number is not spy " + temp);
   
        }
    }

    public static void main(String[] args) {
        spy_number spy = new spy_number();
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        spy.spy_check(num);
    }
    
}
