import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class AdventureGameFunctional {

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
		}
		if (firstanswer.equals("Yes")){
			System.out.println("That was a short adventure, you are weak and now dead.");
			System.out.println("You are dead so leave my game now please. Or play again I don't care. I DON'T CARE!");
			
		}else if (firstanswer.equals("No")){
			System.out.println("Still have some fight in you Eh? I'll get every last drop out of you yet!");
			System.out.println("Speaking of drops, it just started raining.");
			System.out.println("ACID RAIN!!!!");
			System.out.println("Just playing, it is just regular rain but you should probably get inside.");
			System.out.println("Lucky for you there is a creepy old house to your right, a tree to your left, and dead ahead a nice dry cave.");
			System.out.println("So what'll it be? House, Tree, or Cave? Don't worry no tricks here I just don't want you to catch a cold.");
			String secondanswer = (scanner.next());
			while (!validReplysecond.contains(secondanswer)){
				System.out.println("Just type Tree or House or Cave Asshole!");
				secondanswer = (scanner.next());
			}
			if (secondanswer.equals("House")){
			System.out.println("YOU CHOSE THE CREEPY OLD HOUSE! Lucky for you it is my house and I invite you in for a spot of tea. Bad news I poisoned the tea, you're dead");
			}else if (secondanswer.equals("Cave")){
			System.out.println("This cave is literally filled with bears, you are ripped limb from limb. The good news is they found you delicious! Bad news you're dead.");
			}else if (secondanswer.equals("Tree")){
				System.out.println("Smart boy, or girl I don't care! Your smart that's what is important");
				System.out.println("I haven't killed you yet, no worries you will die");
				System.out.println("In Fact you aregoing to chose how right now.");
				System.out.println("So what should I kill you with a knife, my teeth, or a curb?");
				String howyoudie = (scanner.next());
				switch (howyoudie){
					case "knife": 
						System.out.println("I stab you in the eye with a knife. Lot of blood which is nice, but its been done before.");
						System.out.println("Your dead and you bore me with your lack of creativity, I mean a knife really?");
						System.out.println("Either way your dead, leave my game. NOW PLEASE!");
						break;
					case "teeth":
						System.out.println("HOLEY SHIT! I just gnawed your leg off!!!");
						System.out.println("I hit the caradid artery after a couple bites, blood spraying everywhere.");
						System.out.println("Now that was fun, classy way to go kid. I like you!");
						System.out.println("But your dead, soooo leave my game. NOW PLEASE");
						break;
					case "curb":
						System.out.println("Wow, your head just split like a melon.");
						System.out.println("That choice was graffic even for me.");
						System.out.println("I don't even feel good about it.");
						System.out.println("I FEEL GREAT! I AM FUCKING American History X EDWARD NORTON CYBERTRON REECARNATE!!!");
						System.out.println("I FEEL SO ALIVE!!!");
						System.out.println("But your dead, so leave my game. NOW PLEASE");
						break;
					default:
						System.out.println("You just had to pick "+ howyoudie+"!");
						System.out.println("You're so creative.");
						System.out.println("Just kidding I hate you!");
						System.out.println("You survive my game.");
						System.out.println("Have fun living or whatever I guess.");
						System.out.println("Leave my game. Now please!");
						break;
				}
			}
		}
	}
}
			
		