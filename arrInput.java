import java.util.Scanner;

class arrInput{
   
    public static void main(String[] args) {
        
        int size;
        System.out.println("Enter the array size:");
       Scanner sc =  new Scanner(System.in);
       size = sc.nextInt();
       int[] arr = new int[size];

       System.out.println("Enter the array elements:");
    for(int i=0; i<size; i++){

        arr[i] = sc.nextInt();
 }

       System.out.println("The array is: ");
        for(int i=0; i<size; i++){
           System.out.println(arr[i]);
        }
    }
}
