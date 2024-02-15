
import java.util.InputMismatchException;
import java.util.Scanner; //import Scanner class

public class BertramCodingChallenge {
	
	//using EuclidsAlgoritm to find the GCD 
	static int gcdByEuclidsAlgorithm(int n1, int n2) {
	    if (n2 == 0) {
	        return n1;
	    }
	    return gcdByEuclidsAlgorithm(n2, n1 % n2);
	}
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		
		final int NUM_COWORKERS = 5;
		Coworker coworkers[] = new Coworker[NUM_COWORKERS];
		int totalPrice = 0;
		double coffeePrice = 0;
		
		//For each coworker, prompt for name and price and add to the list
		for(int i = 0; i < NUM_COWORKERS; i++) {
			System.out.println("Enter the coworker's name:");
			String name = scanner.nextLine();
			System.out.println("Enter the coffee price:");
			while(true) {
				try {
					coffeePrice = scanner.nextDouble();
					break;
				} catch (InputMismatchException e) {
					scanner.nextLine();
				}
			}
			scanner.nextLine();
			//represent the price as cents to reduce rounding errors
			coffeePrice = (int) (coffeePrice * Math.pow(10, 2));
			coworkers[i] = new Coworker(name, (int) coffeePrice);
			
			//add to the total price
			totalPrice += coffeePrice;
			
		}

				
		int days = totalPrice;
	
		//checks if reduction is possible across all the number in order to shorten
		//the schedule and make it more user-friendly/realistic
		int totalGCD = totalPrice;
		for(int i = 0; i < NUM_COWORKERS; i++) {
			//find the greatest common denominator between all the daysToPay and total
			//to see if reduction is possible 
			
			totalGCD = gcdByEuclidsAlgorithm(totalGCD, coworkers[i].getCoffeePrice());
			
		}
		
		//if a GCD was found, divide every value by the GCD 
		if(days > 0) {	
			days = days/totalGCD;
			for(Coworker worker : coworkers) {
				worker.setDaysToPay(worker.getCoffeePrice()/totalGCD);
			}
		}
		
		//print out the total number of days for an even rotation and how many
		//days each person is expected to pay
		System.out.println("This rotation operates on a " + days + " day schedule.");
		for(Coworker worker : coworkers) {
			System.out.println(worker);
			worker.setPercentage((double)(worker.getDaysToPay())/days);
		}
		
		System.out.println();
		System.out.println("Press enter to print the schedule: ");
		scanner.nextLine();
		int trackDays = 1;
		int trackTotal = days;
		
		//prints the entire schedule 10 days at a time using percentages of the total cost
		//to create a roughly fair pay cycle with any rounding error accounted for at the
		//end
		while(trackTotal > 0) {
			for(int i = 0; i < NUM_COWORKERS; i++) {
				double percentage = coworkers[i].getPercentage();
				percentage = percentage * 10; 
				for(int j = 0; j < (int) Math.round(percentage); j++) {
					if(coworkers[i].getDaysToPay() > 0) {
						System.out.println("Day " + trackDays + ": " + coworkers[i].getName());
						coworkers[i].setDaysToPay(coworkers[i].getDaysToPay()-1);
						trackDays++;
						trackTotal--;
					}
				}
			}
			System.out.println("Press enter to print next: ");
			scanner.nextLine();
			}
		scanner.close();
	}
	
	
}

