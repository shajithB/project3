public class Thread {
	
		
		 	public void run()
		 	{
		  		System.out.println("concurrent thread started running..");
		}
		 	public static void main( String args[] )
		 	{
		  		Thread a = new  Thread();
		  		a.start();
		 	}
			void start() {
				// TODO Auto-generated method stub
				System.out.println("hello world!");
			}
			public static void sleep(int i) {
				// TODO Auto-generated method stub
				
			}
			public static Object currentThread() {
				// TODO Auto-generated method stub
				return null;
			}
		}