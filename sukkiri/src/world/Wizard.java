package world;

public class Wizard extends Character {
	int mp = 30;
	
	public Wizard(String name) {
		super(name);
	}
	
	public Wizard() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void heal(Hero h) {
		h.setHp(h.getHp() + 10);
		System.out.println(h.getName() + "のHPを10回復した！");
	}

	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ");
		m.hp = m.hp - 3;
	}
	
	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ");
		m.hp = m.hp - 20;
		this.mp = this.mp - 5;
	}
}
