package Obj;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {
	private String name;
	private Date hi =new Date();

	List<Sankasha> slist=new ArrayList<>();


	public Event(String name) {
		this.name = name;

		this.hi = new Date();

	}
	void add(Sankasha s) {
		this.slist.add(s);

	}


	void show() {
		System.out.println(this.name);
		
		SimpleDateFormat f=new SimpleDateFormat("yyyy年MM月dd日");
		String s= f.format(hi);
		System.out.println(s);
		
		for(Sankasha sa:slist) {
			System.out.println(sa.getName()+" "+sa.getAge()+"歳");
		}
	}


}
