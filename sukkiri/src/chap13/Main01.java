package chap13;

import world.Hero;

public class Main01 {

	public static void main(String[] args) {
		
		Hero h = new Hero();
		try {
			h.setName("桃太郎桃太郎桃太郎桃太郎");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("ヒーローの名前は" + h.getName());

	}

}
