import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class AdventureAwaits {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);	
	System.out.println("What is your name Adventurer?");
	String username = (scanner.next());
	System.out.println("Are you ready to die " + username+"? " + "Yes / NO?");
	String firstanswer = (scanner.next());
	List<String> validReplyfirst = Arrays.asList("Yes","No");
	List<String> validReplysecond = Arrays.asList("House","Tree","Cave");
		while (!validReplyfirst.contains(firstanswer)){
			System.out.println("Just type Yes or No Asshole!");
			firstanswer = (scanner.next());
		
			if (firstanswer == "Yes"){
				System.out.println("That was a short adventure, you are weak and now dead.");
				break;
				
			}else if (firstanswer == "No"){
				System.out.println("Still have some fight in you Eh? I'll get every last drop out of you yet!");
				break;
			}
		System.out.println("Speaking of drops, it just started raining.");
		System.out.println("ACID RAIN!!!!");
		System.out.println("Just playing, it is just regular rain but you should probably get inside. Lucky for you there is a creepy old house to your right, a tree to your left, and dead ahead a nice dry cave.");	
		System.out.println("So what'll it be? House, tree, or cave? Don't worry no tricks here I just don't want you to catch a cold.");
		String secondanswer = (scanner.next());
		while (!validReplysecond.contains(secondanswer)){
			System.out.println("Just type Tree or House or Cave Asshole!");
			secondanswer = (scanner.next());
			if (secondanswer == "House"){
				System.out.println("YOU CHOSE THE CREEPY OLD HOUSE! Lucky for you it is my house and I invite you in for a spot of tea. Bad news I poisoned the tea, you're dead");
				break;
			}else if (secondanswer == "Cave"){
				System.out.println("This cave is literally filled with bears, you are ripped limb from limb. The good news is they found you delicious! Bad news you're dead.");
				break;
			}else if (secondanswer == "Tree");
			System.out.println("Smart boy, or girl I don't care! Your smart that's what is important");
				break;
	}
}
}
}

	