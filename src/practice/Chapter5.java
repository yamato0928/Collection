package practice;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ソート前表示");
		Task task = new Task();
		task.setData("2021-10-21", "牛乳を買う");
		task.setData("2021-09-15", "〇〇社面接");
		task.setData("2021-12-04", "手帳を買う");
		task.setData("2021-08-10","散髪に行く");
		task.setData("2021-11-09", "スクールの課題を解く");
		task.PrintData();
		System.out.println("ソート後表示");
		task.SortAndPrintData();
	}

}
