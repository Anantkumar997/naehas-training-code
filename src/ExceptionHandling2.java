import java.util.Scanner;

public class ExceptionHandling2 {
	
	 static void validate (int age) throws InvalidAgeException{    
	       if(age < 18){  
	  
	        // throw an object of user defined exception  
	        throw new InvalidAgeException("age is not valid to vote");    
	    }  
	       else {   
	        System.out.println("welcome to vote");   
	        }   
	     }  
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt();
		try {
			validate(age);
		}
		catch (InvalidAgeException ex)  {  
            System.out.println("Caught the exception");  
    
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
        }  

	}

}
