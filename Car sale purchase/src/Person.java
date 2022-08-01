import java.util.Scanner;

public class Person {
        protected String owner;
        protected long contact;        // phone number
        protected String address;
//constructor
        Person(String owner, long contact, String address){
            this.owner = owner;
            this.contact = contact;
            this.address = address;
        }
//setter-getter
void setter(String owner, long contact, String address){
    this.owner = owner;
    this.contact = contact;
    this.address = address;
}
String getOwner(){
            return owner;
}
long getContact(){
            return contact;
}
String getAddress(){
            return  address;
}

    //Scanner object
    Scanner input = new Scanner(System.in);
    int choice;

        //to take input from user.
    void dataUser(){
        System.out.println("Enter name:");
        owner = input.next();
        System.out.println("Enter Contact no:");
        contact = input.nextLong();
        System.out.println("Enter address:");
        address = input.next();
    }
    }
    //inheritance
    class seller extends Person {

        seller(String owner, long ph, String address) {
            super(owner, ph, address);
        }

        //scanner class
        static int size = 5;
        int count = 1;

        //toyota seller.
        void toyotaSeller() {
            // putting data
            String[] arrOwner = {"Mohsin", "Ali", "Haris", "Faizan"};
            long[] arrPh = {309354659, 312472765, 345472765, 301472765};
            String[] arrAdd = {"H#78", "H#25", "H#16/4 ", "H#190"};
            int arrLength = arrOwner.length;
            count = arrLength;
            String[] tOwner = new String[size];
            long[] tContact = new long[size];
            String[] tAddress = new String[size];
            for (int i = 0; i < size; i++) {
                tOwner[i] = null;
                tContact[i] = 0;
                tAddress[i] = null;
            }
            for (int i = 0; i < arrLength; i++) {
                tOwner[i] = arrOwner[i];
                tContact[i] = arrPh[i];
                tAddress[i] = arrAdd[i];
            }
            tOwner[count] = owner;
            tContact[count] = contact;
            tAddress[count] = address;
            count++;
        }

        void hondaSeller() {
            // putting data
            String[] arrOwner = {"Mohsin", "Ali", "Haris", "Faizan"};
            long[] arrPh = {309354659, 312472765, 345472765, 301472765};
            String[] arrAdd = {"H#78", "H#25", "H#16/4 ", "H#190"};
            int arrLength = arrOwner.length;
            count = arrLength;
            String[] hOwner = new String[size];
            long[] hContact = new long[size];
            String[] hAddress = new String[size];
            for (int i = 0; i < size; i++) {

                hOwner[i] = null;
                hContact[i] = 0;
                hAddress[i] = null;
            }
            for (int i = 0; i < arrLength; i++) {
                hOwner[i] = arrOwner[i];
                hContact[i] = arrPh[i];
                hAddress[i] = arrAdd[i];
            }
            hOwner[count] = owner;
            hContact[count] = contact;
            hAddress[count] = address;
            count++;
        }

        void display(String[] tOwner, long[] tContact, String[] tAddress, String[] hOwner, long[] hContact, String[] hAddress, int index) {
            System.out.println("1-Toyota: ");
            System.out.println("2-Honda: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Owner: " + tOwner[index]);
                System.out.println("Contact no:" + tContact[index]);
                System.out.println("Address" + tAddress[index]);
            }
            else if (choice == 2){
                System.out.println("Owner: " + hOwner[index]);
                System.out.println("Contact no:" + hContact[index]);
                System.out.println("Address" + hAddress[index]);
            }
            else {
                System.out.println("Invalid choice.");
            }
        }
    }