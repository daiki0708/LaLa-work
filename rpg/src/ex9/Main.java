package ex9;

import world.Thief;

public class Main {
	public static void heal(int hp) {
		hp = hp + 10;
	}
	
	public static void heal(Thief thief) {
		thief.hp = thief.hp + 10;
	}

	public static void main(String[] args) {
		int baseHP = 25;
		Thief t = new Thief("アサカ", baseHP);
		System.out.println(baseHP + " : " + t.hp);
		heal(baseHP);
		heal(t);
		System.out.println(baseHP + " : " + t.hp);

	}

}
