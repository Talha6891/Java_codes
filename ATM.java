import java.util.Scanner;

class ATM {

    public static void main(String[] args) {
       
float balance = 1000;
int choice;
char ch; // to again use or check.
float dep =0; // to take amount deposited from the user.
float w_draw = 0; // to take amount withdraw by the user.
do{
        System.out.println("Enter 1 to Deposit: ");
        System.out.println("Enter 2 to Withdraw: ");
        System.out.println("Enter 3 to Check Balance: ");
        System.out.println("Enter 4 to Exit: ");

        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Enter amount to deposit: ");
            dep = sc.nextInt();
            balance +=  dep;
            System.out.println("Your cuurent balance is: " + balance);
            break;
        }
            else if(choice == 2){
                System.out.println("Enter amount to withdraw: ");
                w_draw = sc.nextFloat();
                balance -=  w_draw;
                System.out.println("Now your balance is: " + balance);
                break;
            }
            else if(choice == 3){
                System.out.println("Your balance is: " + balance);
                break;
            }
            else if(choice == 4){
                break;
            }
            System.out.println("Again use ATM press (y/n) ");
            ch = sc.next().charAt(0);   
        }while(ch == 'y');
    }
    
}