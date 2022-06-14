import java.util.Scanner;

class arr_sum{
    public static void main(String[] args){

        int sum=0,input=0,size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
          size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter your array elements: ");
        for(int i=0; i<size; i++){
            input = sc.nextInt();
               arr[i] = input;
        }
        for(int j =0; j<size; j++){
            sum = sum + arr[j];
        }
    System.out.println("The sum of array is: " + sum);

}       
    }