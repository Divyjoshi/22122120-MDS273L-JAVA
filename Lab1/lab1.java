package Lab1;
import java.util.*;

public class lab1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Name; 
        System.out.printf("Enter Name : ");
        Name = scan.nextLine();

        int Age; 
        System.out.print("Enter Age : ");
        Age = Integer.parseInt(scan.nextLine());

        String reg_no; 
        System.out.printf("Enter Registration no : ");
        reg_no = scan.nextLine();

        String Class; 
        System.out.printf("Enter Class : ");
        Class = scan.nextLine();

        String Email; 
        System.out.printf("Enter Email : ");
        Email = scan.nextLine();

        char gender; 
        System.out.printf("Enter gender (M/m or F/f): ");
        gender = scan.nextLine().charAt(0);

        System.out.println(" Enter your Following Details : ");
        System.out.println(" Entered User Details are :- " + "\n\nName is : " +Name+ "\nGender is : "+gender+ "\nAge : "+Age+"\nRegistration No : "+ reg_no + "\nClass : "+ Class + "\nEmail is : " + Email );

        if( gender =='f' ||gender == 'F'){
            System.out.println("User is a FEMALE." );
        }else if( gender =='m'||gender =='M'){
            System.out.println("User is a MALE.");
        }

        System.out.println(" Enter your State Zone Like - NORTH | SOUTH | EAST | WEST : ");
        String State = scan.nextLine();
        switch(State){
            case "NORTH":
            System.out.println("The Student is from the northern states of India");
            break;
            case "SOUTH":
            System.out.println("The Student is from the sourthern states of India");
            break;
            case "EAST":
            System.out.println("The Student is from the eastern states of India");
            break;
            case "WEST":
            System.out.println("The Student is from the western states of India");
            break;
        }
        scan.close();
    }
}