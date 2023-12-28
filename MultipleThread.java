package AnudipProject;

class Task1 implements Runnable {
    public void run() {           //thread for printing numbers
        for (int i = 1; i <= 25; i++) {
            System.out.println("Task 1: Printing integer values: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            	System.out.println(e);
            }
        }
    }
}

class Task2 implements Runnable {
    public void run() {                    //thread for printing characters
    	for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("Task 2: Printing characters: " + c);
            try {
                Thread.sleep(300); 
            } catch (InterruptedException e) {
            	System.out.println(e);
            }
        }
    }
}

public class MultipleThread {
    public static void main(String[] args) {
 
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());

        thread1.start();
        thread2.start();
        
        try {
            thread1.join();  //Wait for both threads to finish before exiting the program
            thread2.join();
        } catch (InterruptedException e) {
        	System.out.println(e);
        }
        
        System.out.println("Main thread exiting.");
    }
}

