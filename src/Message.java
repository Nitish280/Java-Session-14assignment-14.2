// here we are creating the class Message and implimenting the runnable interface
public class Message implements Runnable {
	//here we creating the method of thread	
	public void run() {
		//here we are intialising the loop
		for (int i = 0; i < 10; i++) {
			System.out.println("Welcome to AcadGild" + i);

			// thread to sleep for 3000 milliseconds
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
			Message m = new Message();
			Thread t = new Thread(m);
			//here we are creating the thread
			t.start();
			t.start();
			/**
			 * when we call the same method two times then it will gives the exception of thread
			 * so we can can not start the thread twice
			 * here we are handling the exception after calling the same method twice
			 */
		} catch (IllegalThreadStateException e) {
			System.out.println("You cannot start a thread twice");
		}catch (Exception e){
			e.printStackTrace();
			
		}

	}

}
