import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Car {
    private String carName;
    private String numberPlate;
    private int model;
    private int enginePower;
    private double price;

    //constructor


    public Car(String carName,String numberPlate, int model, int enginePower, double price) {

        this.carName = carName;
        this.numberPlate = numberPlate;
        this.model = model;
        this.enginePower = enginePower;
        this.price = price;
    }
    //setter
    public void setCar(String carName,String numberPlate, int model, int enginePower, double price) {

        this.carName = carName;
        this.numberPlate = numberPlate;
        this.model = model;
        this.enginePower = enginePower;
        this.price = price;
    }
    //getter

    String getCarName() {
        return carName;
    }
    String getNumberPlate(){
        return  numberPlate;
    }

    int getModel() {
        return model;
    }

    int getEnginePower() {
        return enginePower;
    }

    double getPrice() {
        return price;
    }

    //Car array for category
    String[] company = {"Toyota", "Honda", "Suzuki"};

    // array for storing data details.
    String[] arrName = new String[3];
    String[] arrPlate = new String[3];
    int[] arrModel = new int[3];
    int[] arrEngine = new int[3];
    double[] arrPrice = new double[3];

    Scanner input = new Scanner(System.in);
    char choose;
    int choice;

    //making input method for car.
    void inputData() {
        System.out.println("Enter car name: ");
        carName = input.next();
        System.out.println("Enter number plate: ");
        numberPlate= input.next();
        System.out.println("Enter car model: ");
        model = input.nextInt();
        System.out.println("Enter Engine Power(cc): ");
        enginePower = input.nextInt();
        System.out.println("Enter Price: ");
        price = input.nextDouble();
    }

    //seller method
    public void seller() {
        int i = 1, j = 0, choice;
        char choose;
        do {
            System.out.println("choose Company: ");  // print category.
            for (String item : company) {
                System.out.println(i + "-" + item);
                i++;
            }
            System.out.println("0- Exit.");
            i = 1;
            choice = input.nextInt();

            if (choice == 1) {
                inputData();
                arrName[j] = carName;
                arrPlate[j]= numberPlate;
                arrModel[j] = model;
                arrEngine[j] = enginePower;
                arrPrice[j] = price;

            } else if (choice == 2) {
                inputData();
                arrName[j] = carName;
                arrPlate[j]= numberPlate;
                arrModel[j] = model;
                arrEngine[j] = enginePower;
                arrPrice[j] = price;
            } else if (choice == 3) {
                inputData();
                arrName[j] = carName;
                arrPlate[j]= numberPlate;
                arrModel[j] = model;
                arrEngine[j] = enginePower;
                arrPrice[j] = price;
            } else if (choice == 0) {
                break;

            } else {
                System.out.println("Invalid choice.");
            }
            System.out.println("Add another car (y/n): ");
            choose = input.next().charAt(0);
            j++;

        } while (choose == 'y' && j <=3);
    }

    //print all available cars.
    void showAll() {
        double temp;
        System.out.println("Show All available car (y/n)?");
        choose = input.next().charAt(0);
           if (choose == 'y') {
    //sorting algorithm
            for (int i = 0; i < 3 - 1; i++) {
                for (int j = i + 1; j < 3; j++) {
                    if (arrPrice[j] < arrPrice[i]) {
                        temp = arrPrice[j];
                        arrPrice[j] = arrPrice[i];
                        arrPrice[i] = temp;
                    }
                }
            }
            for (int i=0; i<3; i++){
                System.out.println("Car Name: " +arrName[i]);
                System.out.println("Number Plate: " +arrPlate[i]);
                System.out.println("Model: " + arrModel[i]);
                System.out.println("Engine Power(cc): " + arrEngine[i]);
                System.out.println("Price: " + arrPrice[i]);
            }
        }
    }

    // car buyer method
    public void buyer() {
        int i = 1;
        System.out.println("Which Company of car you want: ");  // print category.
        System.out.println();
        for (String item : company) {
            System.out.println(i + "-" + item);
            i++;
        }
        System.out.println("4- Exit.");
        choice = input.nextInt();
        do {
            if (choice == 0 || choice == 1 || choice == 2) {

                System.out.println("Company: " + company[choice]);
                System.out.println("Car Name: " + arrName[choice]);
                System.out.println("Model: " + arrModel[choice]);
                System.out.println("Engine Power(cc): " + arrEngine[choice]);
                System.out.println("Price: " + arrPrice[choice]);

            }
            else if (choice == 4){
                break;
            }
            else {
                System.out.println("Invalid choice.");
            }
            System.out.println("choose company to see that company cars: ");
            i=1;
            for (String item: company){
                System.out.println(i + "-" + item);
                i++;
            }
            System.out.println("4-Exit.");
            choice = input.nextInt();
        } while (choice == 0 || choice ==1 || choice ==2);
    }

    //AI based
    public void recommend() {

        double bestPrice;
        int engine;
            System.out.println("Enter your car budget: ");
            bestPrice = input.nextDouble();
        System.out.println("Enter Engine power(cc): ");
        engine = input.nextInt();
            for (int i =0; i<3; i++){

                if(arrEngine[i] <= engine && bestPrice <= arrPrice[i]){

                    System.out.println("Company: " + company[i]);
                    System.out.println("Number Plate: " +arrPlate[i]);
                    System.out.println("Car Name: " + arrName[i]);
                    System.out.println("Model: " + arrModel[i]);
                    System.out.println("Engine Power(cc) " + arrEngine[i]);
                    System.out.println("Price: " + arrPrice[i]);
                    break;
                }
            }
        }
    }
