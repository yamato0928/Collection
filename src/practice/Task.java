package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {
	//メンバ変数
	//追記箇所 230114
	private LocalDate date;
	private String task;
	//
	private List<LocalDate> dates = new ArrayList<LocalDate>();
	private List<String> tasks = new ArrayList<String>();
	private Map<LocalDate, String> dateTaskMap = new HashMap<LocalDate, String>();

	//コンストラクタ
	//各種値の初期化を行う
	public void Task() {
		this.date=null;
		this.task=null;
		this.dates.clear();
		this.dates.clear();
		this.dateTaskMap.clear();
	}
	
	//外部からの参照用メソッド
	public LocalDate getDate() {
		return date;
	}
	
	public String getTask() {
		return task;
	}
	
	public List getDatesList() {
		return dates;
	}
	
	public List getTasksList() {
		return tasks;
	}
	
	public Map getDateTaskMap() {
		return dateTaskMap;
	}
	
	//変更箇所 230114
	//引数をlocalDate→inputLocalDate, task→inputTaskに変更
	//引数をメンバ変数に入れてからリストやマップに格納する形式に変更
	public void setData(String inputLocalDate, String inputTask) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		date = LocalDate.parse(inputLocalDate, dateTimeFormatter);
		task = inputTask;
		dates.add(date);
		tasks.add(task);
		dateTaskMap.put(date, task);
	}
	//
	
	public void SortAndPrintData() {
		dates.sort((s1, s2) -> s1.compareTo(s2));
		for (LocalDate date : dates) {
			PrintData(date,dateTaskMap.get(date));
		}
	}
	
	public void PrintData(LocalDate localDate, String task) {
		System.out.println(localDate+":"+task);
	}
	
	public void PrintData() {
		for (Map.Entry<LocalDate, String> dateTaskSet : dateTaskMap.entrySet()) {
			System.out.println(dateTaskSet.getKey() + ":" + dateTaskSet.getValue());
		}
	}
}
