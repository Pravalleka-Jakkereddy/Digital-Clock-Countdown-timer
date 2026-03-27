import java.util.*;
import java.time.LocalTime;

class DigitalClock {

    public static void startClock() {
        while (true) {
            LocalTime time = LocalTime.now();

            System.out.print("\rCurrent Time: " + time.getHour() + ":"
                    + time.getMinute() + ":" + time.getSecond());

            try {
                Thread.sleep(1000); // wait 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



class CountdownTimer {

    public static void startTimer(int seconds) {

        while (seconds >= 0) {
            int mins = seconds / 60;
            int secs = seconds % 60;

            System.out.print("\rTime Left: " + mins + ":" + secs);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            seconds--;
        }

        System.out.println("\n⏰ Time's up!");
    }
}



class A 
{
    	public static void main(String[] args) 
	{

        	Scanner sc = new Scanner(System.in);

        	while (true) 
		{
            		System.out.println("\n1. Digital Clock");
            		System.out.println("2. Countdown Timer");
            		System.out.println("3. Exit");
            		System.out.print("Enter choice: ");

            		int choice = sc.nextInt();

            		switch (choice) 
			{
                		case 1:	DigitalClock.startClock();
                    			break;

                		case 2:	System.out.print("Enter time in seconds: ");
                    			int seconds = sc.nextInt();
                    			CountdownTimer.startTimer(seconds);
                    			break;

                		case 3:	System.out.println("Exiting...");
                    			System.exit(0);

                		default:System.out.println("Invalid choice!");
            		}
        	}
    	}
}