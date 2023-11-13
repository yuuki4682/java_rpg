public class Hero {
	
	String name;
	int hp;
	Sword sword;
	static int money;
	
	void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER!");
		System.out.println("最終㏋は" + this.hp + "でした");
	}
	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
	}
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	Hero(String name){
		this.name = name;
		this.hp = 100;
	}
	
	Hero(){
		this.name = "ダミー";
		this.hp = 100;
	}
}