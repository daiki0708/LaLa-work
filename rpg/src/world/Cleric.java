package world;

import java.util.Objects;
import java.util.Random;

public class Cleric {
	private String name;
	private int hp = 50;
	public static final int HP_MAX = 50;
	private int mp = 10;
	public static final int MP_MAX = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = HP_MAX; //定数にはthisがなくてもよい
		System.out.println("聖職者は「セルフエイド」という魔法を使った。");
		System.out.println("HPが最大値(50)まで回復した。");
		System.out.println("mpを5使った。");
	}
	
	/**
	 * 聖職者は祈ることで自分のMPを回復できる。
	 * 回復量は祈る秒数ランダム(3未満)
	 * ただし、最大HPを超えることはない.
	 * @param sec int 祈る秒数
	 * @return int 回復量
	 */
	public int pray(int sec) {
		int hosei = new Random().nextInt(3);
		int kaihuku = sec + hosei;
		//this.mp = this.mp + kaihuku;
		if (this.mp + kaihuku > MP_MAX) {
			kaihuku = MP_MAX - this.mp;
		}
		this.mp = this.mp + kaihuku;
		System.out.println("聖職者は" + sec + "秒祈った");
		System.out.println("MPが" + kaihuku + "回復した。");
		return kaihuku; //あとで変更する
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public static int getHpMax() {
		return HP_MAX;
	}

	public static int getMpMax() {
		return MP_MAX;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hp, mp, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cleric other = (Cleric) obj;
		return hp == other.hp && mp == other.mp && Objects.equals(name, other.name);
	}
}

