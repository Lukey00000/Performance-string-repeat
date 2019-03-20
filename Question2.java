public class Question2 {
	
	public static void main(String [] args) {
		naiveRun();
		preciseRun();
	}
	
	static int naiveRun() {
		int n1 = 1;
		double startTime1;
		double stopTime1;
		double totalTime1;
		
		StringRepeater sr1 = new StringRepeater();
		System.out.println("Naive run");
		//This iterates the value of n from 1 to 100 to 1000 to 10000
		for(int i=0; i<4; i++) {
			//The function nanoTime returns the current value of the system timer in nanoseconds
			startTime1 = System.nanoTime();
			
			sr1.repeatString("hello", n1);
			//nanoTime is ran again and the first time is subtracted from the second time to give the value of how much time has passed
			stopTime1 = System.nanoTime();
			
			totalTime1 = (stopTime1 - startTime1)/1000000000;
			System.out.println("T(" +n1+ ") = " +totalTime1+  " seconds");
			
			n1 = n1*10;
			
			if(n1 == 10) {
				n1 = n1*10;
			}
		}
		return 0;
	}
	
	static int preciseRun() {
		int n2 = 1;
		double startTime2;
		double stopTime2;
		double totalTime2;
		double totalTimeRepeats;
		StringRepeater sr2 = new StringRepeater();
		System.out.println("Precise run");
		
		for(int i=0; i<4; i++) {
			startTime2 = System.nanoTime();
			
			//This run is precise as it takes the average of 10000 different runs of repeat string
			for(long j=0; j <= 10000; j++) {
				sr2.repeatString("hello", n2);
			}
			
			stopTime2 = System.nanoTime();
			totalTimeRepeats = (stopTime2 - startTime2)/1000;
			totalTime2 = totalTimeRepeats/1000000000;
			
			System.out.println("T(" +n2+ ") = " +totalTime2+  " seconds");
			
			n2 = n2*10;
			
			if(n2 == 10) {
				n2 = n2*10;
			}
			
		}
		return 0;
	}
}