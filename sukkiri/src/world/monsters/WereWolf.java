package world.monsters;

import world.characters.Hero;

public class WereWolf extends WalkingMonster {

	public WereWolf() {
		System.out.println("WereWolfだよ");
	}
	
	@Override
	public void attack(Hero h) {
		System.out.println(h.getName() + "を噛みつく");
		
	}

}
