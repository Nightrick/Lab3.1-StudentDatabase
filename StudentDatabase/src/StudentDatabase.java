import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int studentSelection;
		
		String studentInfoSelection;
		
		String continueCycle;
		
		String[] studentNames = {"Kim", "Sean", "Noor", "Aida", "David"};
		
		String[] favoriteClass = {"Biology", "Thermodynamics", "Interior Design", "Trigonometry", "Biochemistry"};
		
		String[] favoriteMovie = {"Lady in the Water", "Parasite", "My Big Fat Greek Wedding", "Step Brothers", "Casino Royale"};
		
		System.out.println("Hello there! I'm pleased to introduce you to the students of our class!");
		
		for(int i = 0; i < studentNames.length; i++) {
			System.out.println((i + 1) + ". " + studentNames[i]);
		}
		
		do {
			System.out.print("Who would you like to learn more about? (1-5): ");
			
		while(true) {
			try{	
				studentSelection = intCheck();
				System.out.println("You selected student: " + studentNames[studentSelection] + "!");
				System.out.print("What would you like to know about " + studentNames[studentSelection] + "? Enter \"favorite movie\" or \"favorite class\": ");
				studentInfoSelection = scnr.nextLine().toLowerCase();
				while(true) {
				try {
					if(studentInfoSelection.equals("favorite movie")) {
						System.out.println(studentNames[studentSelection] + "'s favorite movie is: " + favoriteMovie[studentSelection]);
					} else if (studentInfoSelection.equals("favorite class")) {
						System.out.println(studentNames[studentSelection] + "'s favorite class is: " + favoriteClass[studentSelection]);
					}
				} catch (Exception e) {
					System.out.println("That wasn't an option. Let's try again. Please enter \"favorite movie\" or \"favorite class\"");
				}
				}
				
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.print("That's not an option. Please enter a number between 1 and 5: ");
			} 
		}
		

	
		
		
		
		
		
		} while (true); //(continueCycle.equals("y"));
		
		

	}
	
	public static int intCheck() {
		
		Scanner scnr = new Scanner(System.in);
		
		while(true) {
			try {
				return scnr.nextInt();
			} catch (InputMismatchException e){
				scnr.next();
				System.out.print("That's not an option. Please enter a number between 1 and 5: ");
			}
		}
	}
	
	

}
