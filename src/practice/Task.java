package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {
	//メンバ変数
	private List<LocalDate> dates = new ArrayList<LocalDate>();
	private List<String> tasks = new ArrayList<String>();
	private Map<LocalDate, String> dateTaskMap = new HashMap<LocalDate, String>();

	//コンストラクタ
	//各種値の初期化を行う
	public void Task() {
		this.dates.clear();
		this.dates.clear();
		this.dateTaskMap.clear();
	}
	
	//外部からの参照用メソッド
	public List getDatesList() {
		return dates;
	}
	
	public List getTasksList() {
		return tasks;
	}
	
	public Map getDateTaskMap() {
		return dateTaskMap;
	}
	
	public void setData(String localDate, String task) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(localDate, dateTimeFormatter);
		dates.add(date);
		tasks.add(task);
		dateTaskMap.put(date, task);
	}
	
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
