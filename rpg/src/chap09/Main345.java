package chap09;

import world.Hero;
import world.Wizard;

public class Main345 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.setName("ミナト");
		h1.setHp(100);
//		
		Hero h2 = new Hero();
		h2.setName("アサカ");
		h2.setHp(100);
		
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1); //ミナトを回復させる (HP: 100 → 110)
		//w.heal(h2); //アサカを回復させる (HP: 100 → 110)
		//w.heal(h2); //アサカを回復させる (HP: 110 → 120)

	}

}
