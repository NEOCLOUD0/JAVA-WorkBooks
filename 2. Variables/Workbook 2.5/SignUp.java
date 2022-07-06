import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        //Ask for their last name.
        //Ask: how old are you?
        //Ask them to make a username.
        //Ask what city they live in.
        //Ask what country that's from.
        System.out.println("What is your first name?");
        String firstName = scan.nextLine();
        
        System.out.println("What is your last name?");
        String lastName = scan.nextLine();
        
        System.out.println("What is your age?");
        int age = scan.nextInt();
        
        System.out.println("Please create a username.");
        scan.nextLine();					// use a s throw away because cannot scan when has nextInt(); before
        String username = scan.nextLine();
        								
        
        System.out.println("What city do you live in?");
        String city = scan.nextLine();
        
        System.out.println("What country are you from?");
        String country = scan.nextLine();
        


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //
        System.out.println("	First Name: " + firstName);
        System.out.println("	Last Name: " + lastName);
        System.out.println("	Age: " + age);
        System.out.println("	Username: " + username);
        System.out.println("	City: " + city);
        System.out.println("	Country: " + country);


        //close scanner. It's good practice :D ! 
        scan.close();
    }
}