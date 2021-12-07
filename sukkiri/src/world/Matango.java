package world;

public class Matango {
	public int hp;
	// public final int LEVEL = 10;
	public char suffix;
	
	public Matango() {
		this.hp = 50;
	}
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void run() {
		System.out.println
		  ("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃!");
		System.out.println("10のダメージ");
		h.setHp(h.getHp() - 10);
		// System.out.println(h.name + "のHPが" + h.hp + "になった。");
	}
	
	public void status() {
		System.out.println(this.suffix + "のHPは" + this.hp);
	}
}
