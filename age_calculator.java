import  java.util.Scanner;

class age_calculator {
    
static int birth_day, birth_month, birth_year;  // user date of birth.

final int curr_day = 11, curr_month = 6, curr_year = 2022;    // current date, month and year.

int[] arr = {31,31,28,31,30,31,30,31,30,31,30,31,31};  //array to store days in a month.

//getting age from the user.

    void get_dob(){           // dob = date of birth.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birthday date: ");
        birth_day = input.nextInt();

        System.out.print("Enter your birthday month: ");
        birth_month = input.nextInt();

        System.out.print("Enter your birthday year: ");
        birth_year = input.nextInt();

    }
    // age calcualtion.

    int total_year,total_month,total_day;

    void age_cal(){

     // total year =from current year to birth year.   
        total_year =   (curr_year -1) - (birth_year);
    
        //calculating  total days.
        if(birth_year % 4 ==0 && birth_month == 2){    // using if-else-if ladder
                total_day = birth_day - 29;
                total_day += curr_day - arr[curr_month];
                if(total_day <0){
                    total_day =total_day * (-1);
                }
        }
        else if(birth_year % 4 !=0 && birth_month == 2){
            total_day = birth_day - arr[birth_month];
            total_day += curr_day - arr[curr_month];
            if(total_day <0){
                total_day =total_day * (-1);
            }

        }
        else{
        total_day = birth_day - arr[birth_month];
        total_day += curr_day - arr[curr_month];
        if(total_day <0){
            total_day =total_day * (-1);
        }
        } 

        // calcualting total months
        total_month = ((curr_month -1 )- 12) + ((birth_month +1) -12);
        if(total_month <0){
            total_month =total_month * (-1);
        if(total_day >= 30 || total_day >= 31 ){

            total_day= total_day - 30;
            total_month++;
            }
            
        }
        if(total_month >= 12){

            total_month = total_month - 12;
            total_year++;
        }
        
    }

    // leaps years come in your age.
    void leap_year(){
         int temp = birth_year;     // temp will store birth year of user.

        System.out.print("Leap years in your age: ");
        while(temp != curr_year){
        if(temp % 4 ==0){
            System.out.print(temp +" ");
        }
        temp++;
    }
    System.out.println();
}

// To dispalay on screen. 
void display(){
    System.out.print("You age is " + total_year+ " years ");
    System.out.print(total_month +" months ");
    System.out.println(total_day + " days.");
}


    public static void main(String[] args) {
        
        age_calculator ac = new age_calculator();
        char choice ;
    Scanner sc = new Scanner(System.in);
        do{
        ac.get_dob();
        ac.age_cal();
        ac.display();
        ac.leap_year();

        System.out.print("Do you want to continue (y/n)? ");
        choice = sc.next().charAt(0);
        }while(choice == 'y');
}
}