public class Bob {
	
	    public static void main(String args[]) 
	    {
	        int[] arr = new int[3];
	        try 
	        {
	            arr[7] = 3;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!"); 
	        }
	        finally 
	        {
	            System.out.println("The array is of size " + arr.length);
	        }
	    }
	}