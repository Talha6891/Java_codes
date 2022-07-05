
import java.util.Scanner;

public class MainClass{
    public static void main(String[] args) {


        String name = " ", address = " ", e_mail = " ";
        long phone_number = 0;
        // constructor of person class.
        Person p = new Person(name, phone_number, address, e_mail);

          Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your phone number: ");
        phone_number = sc.nextLong();
        System.out.println("Enter your address: ");
        address = sc.next();
        System.out.println("Enter your E-mail: ");
        e_mail = sc.next();

        //constructor of Car class.
        String carName= " ";
        int model = 0;
        int enginePower = 0;
        double price = 0;
        String numberPlate =" ";
        Car c = new Car(carName,numberPlate,model,enginePower,price);
        int choice;
        char choose;
        //getting mode
        do {
            System.out.println("1-Seller.");
            System.out.println("2-Buyer.");
            System.out.println("0-Exit.");
            choice = sc.nextInt();
            if (choice == 1) {
                c.setCar(carName,numberPlate, model, enginePower, price);
                c.seller();
            }
            else if (choice == 2) {
                c.buyer();
                c.showAll();
            }
            else if (choice == 0) {
                break;
            }
            else {
                System.out.println("Invalid entry.");
            }
            System.out.println("Change mode: ");
            System.out.println("To continue press(y/n):");
             choose = sc.next().charAt(0);
        }while (choose == 'y');
        System.out.println("Want Auto Recommendation (y/n)?");
        choose = sc.next().charAt(0);
        if (choose == 'y'){
            c.recommend();
        }
    }

}
