public class DinnerFullCourse {

	private Dish[] list = new Dish[5];// [0]-[4]の計5個

	public static void main(String[] args) {

		DinnerFullCourse fullcourse = new DinnerFullCourse();
		fullcourse.eatAll();
	}

	DinnerFullCourse() {

		list[0] = new Dish();
		list[0].setName("特選シーザサラダ");
		list[0].setValune(10);

		list[1] = new Dish();
		list[1].setName("銀しゃり");
		list[1].setValune(2);
		
		list[2] = new Dish();
		list[2].setName("梅干し");
		list[2].setValune(20);
		
		list[3] = new Dish();
		list[3].setName("おむすび");
		list[3].setValune(15);

		list[4] = new Dish();
		list[4].setName("ラーメン");
		list[4].setValune(30);

	}// Dinnerコンストラクターエンド


	void eatAll(){
		System.err.print("");
		String str = "";
		for (Dish dish : list) {
			str += " 品名:"+dish.getName() + " 値段:" + dish.getValune();
		}
		System.out.print("たかしへ、ママです。今日のフルコースは" + str + "よ");
	}

}// Dishend