public class Person{
        private String name;
        private  long phone_number;
        private  String address;
        private  String e_mail;
        public Person(String name, long phone_number, String address, String e_mail){
            this.name = name;
            this.phone_number = phone_number;
            this.address = address;
            this.e_mail = e_mail;
        }
        public void set(String name, long phone_number, String address, String e_mail){
            this.name = name;
            this.phone_number = phone_number;
            this.address = address;
            this.e_mail = e_mail;
        }
        public String get_name(){
            return name;
        }
        public long get_ph(){
            return phone_number;
        }
        public String getAddress(){
            return  address;
        }
        public String getMail(){
            return  e_mail;
        }
        public void display(){
            System.out.println("Name: " + name);
            System.out.println("Phone Number " +phone_number);
            System.out.println("Address: " + address);
            System.out.println("E-mail: " + e_mail);
        }
    }

