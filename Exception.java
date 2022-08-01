import java.util.InputMismatchException;
import java.util.Scanner;

	public class Exception {
		
			public static void main(String[] args) {
				Scanner a= new Scanner(System.in);
				System.out.println("Enter value");
				
				try {
					
					int num= a.nextInt();
					System.out.println("Value: "+num);
					
				} catch (InputMismatchException e) {
					System.out.println("Wrong input");
				}
				finally {
					a.close();
					System.out.println("Done");
				}
			}
	}