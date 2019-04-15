import java.util.Scanner;

class Day3Task8 {
	public static void main(String args[]) {
		String userInputString;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your Number:");
		userInputString = scanner.nextLine();
		validateUserInput(userInputString);
	}
	
	static void validateUserInput(String userInput) {
		int parsedUserInput = 0;
		boolean isNumber = true;
		
		try {
			parsedUserInput = Integer.parseInt(userInput);
		} catch (NumberFormatException exception) {
			isNumber = false;
			System.out.println("Entered input is not a valid format for an integer!");
		}
		
		if (isNumber) {
			System.out.println("The square of " + parsedUserInput + " is " + Math.round(Math.pow(parsedUserInput, 2)));
		}
	}
}