import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

//        Person p = new Person(null,0,null);
//        p.setter();
        System.out.println("********** Welcome to Car Sale/Purchase **********");
        Car c = new Car();
        Toyota t =new Toyota();
        Honda h = new Honda();
        Scanner input = new Scanner(System.in);
        int choice;
        char choose;
        do {
            System.out.println("Choose Mode:");
            System.out.println("1-Seller.");
            System.out.println("2-Buyer.");
            System.out.println("0-Exit");
            choice = input.nextInt();

            if (choice == 1){
                System.out.println("Choose car category: ");
                System.out.println("1-Toyota:");
                System.out.println("2-Honda:");
                choice =input.nextInt();
                if(choice ==1){
                    t.inputData();
                    t.setData();
                    t.puData();
                }
                else if(choice == 2){
                    h.inputData();
                    h.setData();
                    h.putData();
                }
            }
//seller mode
            else if(choice == 2){
                System.out.println("**** Buyer Mode****");
                System.out.println("1-Toyota:");
                System.out.println("2-Honda:");
                System.out.println("3-Display all cars.");
                choice =input.nextInt();
                if(choice ==1){
                  //  t.setData();
                    t.display();
                }
                else if(choice == 2){
                 //   h.setData();
                    h.putData();
                    h.display();
                } else if (choice == 3) {
                    t.puData();
                    t.display();
                    h.putData();
                    h.display();
                }
            }
            System.out.println("continue....(y/n).");
            choose = input.next().charAt(0);
        } while (choose == 'y');
    }
}
