package Lab6;

public class ThreadExample {
	
	 public static void main(String[] args) {
	        // Create Thread1 to print numbers from 1 to 20
	        NumberPrinter thread1 = new NumberPrinter("Thread1", 1, 20);
	        // Create Thread2 to print numbers from 21 to 60
	        NumberPrinter thread2 = new NumberPrinter("Thread2", 21, 60);

	        // Start both threads
	        thread1.start();
	        thread2.start();

	        // Main thread prints numbers from 61 to 80
	        String mainThreadName = Thread.currentThread().getName();
	        System.out.println(mainThreadName + " is starting.");

	        for (int i = 61; i <= 80; i++) {
	            System.out.println(mainThreadName + ": " + i);
	        }

	        System.out.println(mainThreadName + " has finished.");
     }
}



