import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Weapon {
	int coolKnife = 2;
	int longSword = 5;
	int oldPot = 4;
	int woodSword = 2;
	int bullWhip = 5;
	int roadSign = 3;
	int fists = 1;
	int selectWeapon() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Looks like you have two hands how bout you hold something in them before the fight.");
		List<String> validLeftHand = Arrays.asList("Cool Knife","Long Sword","Wood Sword");
		List<String> validRightHand = Arrays.asList("Bull Whip","Old Pot","Road Sign");
		System.out.println("Tell me what you want to swing around wildly.");
		System.out.println(validLeftHand);
		String leftWeapon = (scanner.next());
		int rightHand;
		int leftHand;
			switch (leftWeapon){
				case "Cool Knife":
					leftHand = coolKnife;
					break;
				case "Long Sword":
					leftHand = longSword;
					break;
				case "Wood Sword":
					leftHand = woodSword;
					break;
				default:
					leftHand = fists;
					break;
			}
		System.out.println(validRightHand);
		String rightWeapon = (scanner.next());
			switch (rightWeapon){
				case "Bull Whip":
					rightHand = bullWhip;
					break;
				case "Old Pot":
					rightHand = oldPot;
					break;
				case "Road Sign":
					rightHand = roadSign;
					break;
				default:
					rightHand = fists;
					break;
			}
		int totalAttack = leftHand + rightHand;
		return totalAttack;
	}

}  