import java.util.Scanner;

class arr_reverse {
    public static void main(String[] args){
        int sum=0,input=0,size =0, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
          size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter your array elements: ");
        for(int i=0; i<size; i++){
            input = sc.nextInt();
               arr[i] = input;
        }
        //Printing array in reverse order.
        System.out.print("Reverse array is: ");
        for(int j =arr.length -1; j>=0; j--){  
            System.out.print(arr[j] + " ");
        }
    }
}
