import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int studentSelection;
		String studentInfoSelection;
		String knowMore;
		String continueCycle;
		
		String[] studentNames = {"Kim", "Sean", "Noor", "Aida", "David"};
		
		String[] favoriteClass = {"Biology", "Thermodynamics", "Interior Design", "Trigonometry", "Biochemistry"};
		
		String[] favoriteMovie = {"Lady in the Water", "Parasite", "My Big Fat Greek Wedding", "Step Brothers", "Casino Royale"};
		
		System.out.println("Hello there! I'm pleased to introduce you to the students of our class!");
		
		for(int i = 0; i < studentNames.length; i++) {
			System.out.println((i + 1) + ". " + studentNames[i]);
		}
				
		while(true) {
			try{
				do {
				System.out.print("Who would you like to learn more about? (1-5): ");
				studentSelection = intCheck();
				System.out.println("You selected student: " + studentNames[studentSelection - 1] + "!");
				System.out.print("What would you like to know about " + studentNames[studentSelection - 1] + "? Enter \"favorite movie\" or \"favorite class\": ");
				
				do {
					studentInfoSelection = scnr.nextLine().toLowerCase();
					if(studentInfoSelection.equals("favorite movie")) {
						System.out.println(studentNames[studentSelection - 1] + "'s favorite movie is: " + favoriteMovie[studentSelection - 1]);
					} else if (studentInfoSelection.equals("favorite class")) {
						System.out.println(studentNames[studentSelection - 1] + "'s favorite class is: " + favoriteClass[studentSelection - 1]);
					} else {
						System.out.print("That wasn't an option. Let's try again. Enter \"favorite movie\" or \"favorite class\": ");
					}
					} while(!(studentInfoSelection.equals("favorite movie") || studentInfoSelection.equals("favorite class")));
				
				do {
				System.out.print("Would you like to know more about " + studentNames[studentSelection - 1] + "? (y/n): ");
				knowMore = scnr.next().toLowerCase();
				
				if(knowMore.equals("y") && studentInfoSelection.equals("favorite movie")) {
					System.out.println(studentNames[studentSelection - 1] + "'s favorite class is: " + favoriteClass[studentSelection - 1]);
					do {
						System.out.print("Would you like to learn more about a different student? (y/n): ");
						continueCycle = scnr.next().toLowerCase();
						if(continueCycle.equals("y")) {
							scnr.nextLine();
						} else if (continueCycle.equals("n")) {
							System.out.println("Thank you! Have a great day!");
							scnr.close();
							System.exit(0);
						} else {
							System.out.println("Sorry, that's not a valid choice. Try again. ");
						}
						}while(!(continueCycle.equals("y") || continueCycle.equals("n")));
				} else if (knowMore.equals("y") && studentInfoSelection.equals("favorite class")) {
					System.out.println(studentNames[studentSelection - 1] + "'s favorite movie is: " + favoriteMovie[studentSelection - 1]);
					do {
					System.out.print("Would you like to learn more about a different student? (y/n): ");
					continueCycle = scnr.next().toLowerCase();
					if(continueCycle.equals("y")) {
						scnr.nextLine();
					} else if (continueCycle.equals("n")) {
						System.out.println("Thank you! Have a great day!");
						scnr.close();
						System.exit(0);
					} else {
						System.out.println("Sorry, that's not a valid choice. Try again. ");
					}
					}while(!(continueCycle.equals("y") || continueCycle.equals("n")));
				} else if (knowMore.equals("n")){
					do {
						System.out.print("Would you like to learn more about a different student? (y/n): ");
						continueCycle = scnr.next().toLowerCase();
						if(continueCycle.equals("y")) {
							scnr.nextLine();
						} else if (continueCycle.equals("n")) {
							System.out.println("Thank you! Have a great day!");
							scnr.close();
							System.exit(0);
						} else {
							System.out.println("Sorry, that's not a valid choice. Try again. ");
						}
					}while(!(continueCycle.equals("y") || continueCycle.equals("n")));
				} else {
					System.out.println("Invalid selection. Try again.");
					continueCycle = "y";
				}
				} while(!(knowMore.equals("y") || knowMore.equals("n")));
				} while(continueCycle.equals("y"));
				
				
				
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.print("That's not an option. ");
			} 
		}
		
		
		
		

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
