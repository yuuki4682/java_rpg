
public class Wizard {
	String name;
	int hp;
	
	void heal(Hero h) {
		int oldHp = h.hp;
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！(" + oldHp + "→" + h.hp + ")");
	}
}
