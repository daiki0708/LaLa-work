package world;

 public class Hero  {
   private String name; //←を書くと名前が出ない
   private int hp;
   private Sword sword;
	 
   public Hero() {
	   System.out.println("Heroのコンストラクタが動作");
   }
   public Hero(String name) {
	   this.name = name;
   }
   
   public int getHp() {
	   return this.hp;
   }
   
   public void setHp(int hp) {
	   this.hp = hp;
   }
   
   public String getName() {
	   return this.name;
   }
   public void setName(String name) {
	   this.name = name;
   }
	
   void sleep() {
	   this.hp = 100;
	   System.out.println(this.name + "は、眠って回復した。");
   }
   
   private void die() {
	   System.out.println(this.name + "は死んでしまった!");
	   System.out.println("GAME OVER です");
   }
   
	public void attack(Matango m) {
		System.out.println
		  (this.name + "の攻撃");
	    System.out.println("敵に5ポイントのダメージを与えた");
	    
	    System.out.println("おばけキノコ" + m.suffix + "から2ポイントの反撃を受けた");
	    this.hp = this.hp - 2;
	    if (this.hp <= 0) {
	    	this.die();
	    }
	}
	
	public void run() {
	   System.out.println(this.name + "は、逃げ出した!");
	}
}