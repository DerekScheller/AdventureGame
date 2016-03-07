import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Character {
	int vestTop = 4;
	int shirtTop = 5;
	int dusterTop = 10;
	int jeansPant = 8;
	int jortsPant = 10;
	int khakisPant = 13;
	int naked = 5;
	void selectCharacter() {
		Scanner scanner = new Scanner (System.in);	
		System.out.println("You look like a bright fellow, would you like to play my game?");
		System.out.println("Why don't you tell me what, is your name?");
		String username = (scanner.next());
		List<String> validTopGarment = Arrays.asList("Vest","Shirt","Duster");
		List<String> validTrouser = Arrays.asList("Jeans","Jorts","Khakis");
		System.out.println("Ok, "+ username + "Tell me what you want to wear.");
		System.out.println(validTrouser);
		String trouser = (scanner.next());
		int choiceOne;
		int choiceTwo;
			switch (trouser){
				case "Jeans":
					choiceOne = jeansPant;
					break;
				case "Jorts":
					choiceOne = jortsPant;
					break;
				case "Khakis":
					choiceOne = khakisPant;
					break;
				default:
					choiceOne = naked;
					break;
			}
		System.out.println(validTopGarment);
		String topGarment = (scanner.next());
			switch (topGarment){
				case "Vest":
					choiceTwo = vestTop;
					break;
				case "Duster":
					choiceTwo = dusterTop;
					break;
				case "Shirt":
					choiceTwo = shirtTop;
					break;
				default:
					choiceTwo = naked;
					break;
			}
			int outfit = choiceOne + choiceTwo;
		System.out.println("You look great in your " + topGarment + " and " +  trouser );
		System.out.print(outfit);
	}

}  