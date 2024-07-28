package Lab6;

public class NumberPrinter extends Thread {
	
	    private int start;
	    private int end;

	    public NumberPrinter(String name, int start, int end) {
	        super(name);
	        this.start = start;
	        this.end = end;
	    }

	    @Override
	    public void run() {
	        // Get and print the thread name
	        String threadName = Thread.currentThread().getName();
	        System.out.println(threadName + " is starting.");

	        // Print numbers in the specified range
	        for (int i = start; i <= end; i++) {
	            System.out.println(threadName + ": " + i);
	        }

	        System.out.println(threadName + " has finished.");
	   }
}

	


