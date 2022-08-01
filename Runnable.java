public class Runnable {
	
		 
	    public static int myCount = 0;
	    public Runnable(){
	         
	    }
	    public void run() throws InterruptedException {
	        while(Runnable.myCount <= 10){
	            System.out.println("Expl Thread: "+(++Runnable.myCount));
				Thread.sleep(100);
	        }
	    } 
	    public static void main(String a[]) throws InterruptedException{
	        System.out.println("Starting Main Thread...");
	        Thread t = new Thread();
	        t.start();
	        while(Runnable.myCount <= 10){
	            System.out.println("Main Thread: "+(++Runnable.myCount));
				Thread.sleep(100);
	        }
	        System.out.println("End of Main Thread...");
	    }
	}