package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
	public static void main(String[] args) {
			
		List<Map<String, String>>list = new ArrayList<Map<String, String>>();
		//����� ���ÿ� �޸𸮸� �־���. ������ new  
		
		Map<String, String> m= new HashMap<String, String>();
		//key,value ���� ����� �����Ҽ� �ִ�.
		m.put("�̸�", "ȫ�浿");   
		m.put("����", "33��");
		list.add(m);
		
		m.put("�̸�", "��浿");     
		m.put("����", "22��");
		list.add(m);
		
		System.out.println(list.size());
		
		for(Map<String,String> m1:list) {
			System.out.println(m1);
		}
		
	}
	
}
