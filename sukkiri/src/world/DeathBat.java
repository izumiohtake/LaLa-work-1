package world;

import chap11_interface.FlyingMonster;

public class DeathBat extends FlyingMonster {

	public DeathBat() {
		System.out.println("デスバットだよ");
	}
	
	@Override
	public void attack(Hero h) {
		System.out.println(h.getName() + "を突っつく");
		
	}

}
