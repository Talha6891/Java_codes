import java.util.Scanner;

class fibonacci{
    public static void main(String[] args) {
            
    int num1=0;
    int num2=1;
    int sum= num1 + num2;
    System.out.println("Enter a number:");
    Scanner sc = new Scanner(System.in);
int input;
input = sc.nextInt();
if(input== 0){
    System.out.println(input);

}
else if (input == 1) {
    System.out.println(input);
}
else{
    System.out.print(num1 + " " + num2);
for(int i=0; i<input;i++){

   sum = num1 + num2;
   System.out.print(sum + " ");
   num1 = num2;
   num2 = sum;
   
}
    }
}
}
