import java.util.Random;
import java.util.Scanner;

class random_num {
    public static void main(String[] args) {
        Random rand = new Random();

        int random_num = rand.nextInt(50);   // random number between 1 to 50.
        int  input;
        System.out.println("Enter number  between 0 to 50: ");
        Scanner sc = new Scanner(System.in);
           input = sc.nextInt();
           int trys = 5, curr_try=0;   // no of trys.
        while (input != random_num ) {
            
            if (trys==curr_try) {
                System.out.println("you lost");
                break;
            }
            System.out.println("Enter again: ");
         if(random_num > input){
             System.out.println("hint! Number is  greater then input");
             input = sc.nextInt();
         }   
         else{
            System.out.println("hint! Number is  less then input");
            input = sc.nextInt();
   
         }
         curr_try++;
        }

        if(input== random_num){
            System.out.println("Congratulations number is found.");
            System.out.println(random_num);
        }
        else{
            System.out.println("The number is: " + random_num);
        }
         
    }
}
