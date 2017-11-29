package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
	public static void main(String[] args) {
			
		List<Map<String, String>>list = new ArrayList<Map<String, String>>();
		//선언과 동시에 메모리를 주었다. 생성자 new  
		
		Map<String, String> m= new HashMap<String, String>();
		//key,value 값을 맘대로 지정할수 있다.
		m.put("이름", "홍길동");   
		m.put("나이", "33살");
		list.add(m);
		
		m.put("이름", "김길동");     
		m.put("나이", "22살");
		list.add(m);
		
		System.out.println(list.size());
		
		for(Map<String,String> m1:list) {
			System.out.println(m1);
		}
		
	}
	
}
