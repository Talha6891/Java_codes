import java.util.Scanner;

class factorial{
    public static void main(String[] args) {
        
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact_value =1;
        if(num==0){
            System.out.println("Number must be greater than 0.");
        } 
        else{
            for(int i=1; i<=num; i++){

                fact_value = fact_value *i;
            }    
        }
        System.out.print("The Factorial of number is: " + fact_value); 
    }
}