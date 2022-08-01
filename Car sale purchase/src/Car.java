import java.util.Scanner;

public class Car {
    protected String carName;
    protected String regNo;    //registration number
    protected int model;
    protected int enginePower;
    protected double invoice;

    //constructor
    public Car() {
        this.carName = carName;
        this.regNo = regNo;
        this.model = model;
        this.enginePower = enginePower;
        this.invoice = invoice;
    }

    //setter
    public void setter
    (String carName, String regNo, int model, int enginePower, double invoice) {

        this.carName = carName;
        this.regNo = regNo;
        this.model = model;
        this.enginePower = enginePower;
        this.invoice = invoice;
    }

    //getter
    String getCarName() {
        return carName;
    }

    String getRegNo() {
        return regNo;
    }

    int getModel() {
        return model;
    }

    int getEnginePower() {
        return enginePower;
    }

    double getInvoice() {
        return invoice;
    }
    //scanner class
    Scanner input = new Scanner(System.in);
    final int size = 5;     // customizable
    public void inputData(){
        System.out.println("Enter Car name: ");
        carName = input.next();
        System.out.println("Enter Registration Number:");
        regNo = input.next();
        System.out.println("Enter Model:");
        model = input.nextInt();
        System.out.println("Enter Engine power(cc):");
        enginePower = input.nextInt();
    }
}
    class Toyota extends Car {
        public Toyota() {
            setter(carName, regNo, model, enginePower, invoice);
        }
        void setData() {
            super.setter(carName, regNo, model, enginePower, invoice);
        }
        String[] tCarName = new String[size];
        String[] tRegNo = new String[size];
        int[] tModel = new int[size];
        int[] tEngine = new int[size];
        double[] tInvoice = new double[size];
        public void puData() {
            // array for storing data details.
            String[] CarName = {"Yaris", "Vitz"};
            String[] arrRegNo = {"LEA 6891", "ICT 687"};
            int[] arrModel = {2022, 2000};
            int[] arrEngine = {1496, 1200};
            double[] arrInvoice = {204567, 21345};
            int arrLenght = CarName.length;
            int temp = arrLenght;
            //Creating another array putting data in it
            //new  toyota array
            String[] tCarName = new String[size];
            String[] tRegNo = new String[size];
            int[] tModel = new int[size];
            int[] tEngine = new int[size];
            double[] tInvoice = new double[size];
            for (int i = 0; i < size; i++) {
                tCarName[i] = null;
                tRegNo[i] = null;
                tModel[i] = 0;
                tEngine[i] = 0;
                tInvoice[i] = 0;
            }
            for (int i = 0; i < arrLenght; i++) {
                tCarName[i] = CarName[i];
                tRegNo[i] = arrRegNo[i];
                tModel[i] = arrModel[i];
                tEngine[i] = arrEngine[i];
                tInvoice[i] = arrInvoice[i];
            }
            tCarName[temp] = carName;
            tRegNo[temp] = regNo;
            tModel[temp] = model;
            tEngine[temp] = enginePower;
            tInvoice[temp] = invoice;
            temp++;
        }
//Display available  cars
        void display(){
            double temp =0;
            System.out.println("**** Toyota Cars ****");
            for (int i = 0; i <size; i++) {
                if(tCarName == null){
                    break;
                }
                else if(tInvoice[i] > tInvoice[i + 1]) {
                    temp = tInvoice[i];
                    tInvoice[i] = tInvoice[i + 1];
                    tInvoice[i + 1] = temp;
                        System.out.println("Car: " + tCarName[i]);
                        System.out.println("Registration number: " + tRegNo[i]);
                        System.out.println("Model" + tModel[i]);
                        System.out.println("Engine Power(cc):" + tEngine[i]);
                        System.out.println("Invoice: " + tInvoice[i]);
                    }
                else{
                    System.out.println("Car: " + tCarName[i]);
                    System.out.println("Registration number: " + tRegNo[i]);
                    System.out.println("Model" + tModel[i]);
                    System.out.println("Engine Power(cc):" + tEngine[i]);
                    System.out.println("Invoice: " + tInvoice[i]);
                    }
                }
            }
        }
// honda cars inheritance

class Honda extends Car {

    public Honda() {
        setter(carName, regNo, model, enginePower, invoice);
    }

    void setData() {
        super.setter(carName, regNo, model, enginePower, invoice);
    }
    String[] hCarName = new String[size];
    String[] hRegNo = new String[size];
    int[] hModel = new int[size];
    int[] hEngine = new int[size];
    double[] hInvoice = new double[size];

    void putData() {
        // array for storing data details.
        String[] CarName = {"City", "Accord"};
        String[] arrRegNo = {"LEA 6891", "ICT 687"};
        int[] arrModel = {2022, 2000};
        int[] arrEngine = {1496, 1200};
        double[] arrInvoice = {204567, 21345};
        int arrLength = CarName.length;
        int temp = arrLength;
        //Creating another array putting data in it
        //new  toyota array
        for (int i = 0; i < size; i++) {
            hCarName[i] = null;
            hRegNo[i] = null;
            hModel[i] = 0;
            hEngine[i] = 0;
            hInvoice[i] = 0;
        }
        for (int i = 0; i < arrLength; i++) {
            hCarName[i] = CarName[i];
            hRegNo[i] = arrRegNo[i];
            hModel[i] = arrModel[i];
            hEngine[i] = arrEngine[i];
            hInvoice[i] = arrInvoice[i];
        }
        hCarName[temp] = carName;
        hRegNo[temp] = regNo;
        hModel[temp] = model;
        hEngine[temp] = enginePower;
        hInvoice[temp] = invoice;
        temp++;
    }

    //Display available  cars
    void display() {
        double temp = 0;
        System.out.println("**** Honda Cars ****");
        for (int i = 0; i < size; i++) {
            if (hCarName == null) {
                break;
            } else if (hInvoice[i] > hInvoice[i + 1]) {
                temp = hInvoice[i];
                hInvoice[i] = hInvoice[i + 1];
                hInvoice[i + 1] = temp;
                System.out.println("Car: " + hCarName[i]);
                System.out.println("Registration number: " + hRegNo[i]);
                System.out.println("Model" + hModel[i]);
                System.out.println("Engine Power(cc):" + hEngine[i]);
                System.out.println("Invoice: " + hInvoice[i]);
            } else {
                System.out.println("Car: " + hCarName[i]);
                System.out.println("Registration number: " + hRegNo[i]);
                System.out.println("Model" + hModel[i]);
                System.out.println("Engine Power(cc):" + hEngine[i]);
                System.out.println("Invoice: " + hInvoice[i]);
            }
        }
    }
//AI recommendation
    void recommend(String[] hCarName, String[] hRegNo, int[] hModel, int[] hEnginePower, double[] hInvoice,
                   String[] tCarName, String[] tRegNo, int[] tModel, int[] tEnginePower, double[] tInvoice){
        int userEngine;
        double budget;
        System.out.println("Enter Engine Power(cc):");
        userEngine = input.nextInt();
        System.out.println("Enter your budget: ");
        budget= input.nextDouble();
        for (int i=0; i<size; i++){

        if (hEnginePower[i] ==0 || tEnginePower[i]==0){
            break;
        }else if (tEnginePower[i] >= userEngine && tInvoice[i] <= budget){
            System.out.println("Car: " + tCarName[i]);
            System.out.println("Registration number: " + tRegNo[i]);
            System.out.println("Model" + tModel[i]);
            System.out.println("Engine Power(cc):" + tEnginePower[i]);
            System.out.println("Invoice: " + tInvoice[i]);
        }
        else if (hEnginePower[i] >= userEngine && hInvoice[i] <= budget){
            System.out.println("Best Match:");
            System.out.println("Car: " + hCarName[i]);
            System.out.println("Registration number: " + hRegNo[i]);
            System.out.println("Model" + hModel[i]);
            System.out.println("Engine Power(cc):" + hEnginePower[i]);
            System.out.println("Invoice: " + hInvoice[i]);
        }
        }
        System.out.println("Sorry! No such car available.");
        }
    }