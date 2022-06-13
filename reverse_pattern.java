import java.util.Scanner;

class reverse_pattern {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i=num-1;i>=0; i-- ){
            for(int j = 0; j<= i; j++){
                System.out.print("*");
            } 
            System.out.println();           
        }
    }
}
