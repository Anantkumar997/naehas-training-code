
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
        {
            System.out.println("Start Program...");
            int num = 99/0;
            System.out.println("after Exception");			// out of reach Statement 
        }
        catch(ArithmeticException ex) 
        {
            System.out.println("ArithmeticException Occor");
        }
        catch(Exception ex)
        {
            System.out.println("Exception Occor");
        }
        System.out.println("End Program...");
	}

}
