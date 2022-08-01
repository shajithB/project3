public class sender {
	
	 
	    public void send(String msg)
	    { 
	        System.out.println("Sending\t"  + msg ); 
	        try
	        { 
	            Thread.sleep(1000); 
	        } 
	        catch (Exception e) 
	        { 
	            System.out.println("Thread  interrupted."); 
	        } 
	        System.out.println("\n" + msg + "Sent"); 
	    } 
	} 
	class ThreadedSend extends Thread 
	{ 
	    private String msg; 
	    sender  sender; 
	    ThreadedSend(String m,  sender obj) 
	    { 
	        msg = m; 
	        sender = obj; 
	    } 
	  
	    public void run() 
	    {  
	        synchronized(sender) 
	        { 
	            sender.send(msg); 
	        } 
	    }

		public void join() {
			// TODO Auto-generated method stub
			
		} 
	} 
	class SyncDemo 
	{ 
	    public static void main(String args[]) 
	    { 
	        sender snd = new sender(); 
	        ThreadedSend S1 = 
	            new ThreadedSend( " Happy " , snd ); 
	        ThreadedSend S2 = 
	            new ThreadedSend( " Pongal " , snd ); 
	        S1.start(); 
	        S2.start(); 
	        try
	        { 
	            S1.join(); 
	            S2.join(); 
	        } 
	        catch(Exception e) 
	        { 
	            System.out.println("Interrupted"); 
	        } 
	    } 
	}