import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Character character1 = new Character();
		int warriorStrength = character1.selectCharacter();
		Weapon weapon1 = new Weapon();
		int warriorAttack = weapon1.selectWeapon();
		

	}

}
