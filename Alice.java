interface aa 
	{  
	    default void show() 
	    { 
	        System.out.println("Default First"); 
	    } 
	} 
	interface bb 
	{  
	    default void show() 
	    { 
	        System.out.println("Default Second"); 
	    } 
	}  
	public class Alice implements aa, bb 
	{  
	    public void show() 
	    {  
	        aa.super.show(); 
	        bb.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	Alice a = new Alice(); 
	        a.show(); 
	    } 
	}