package assignment_week3;

import java.util.HashMap;
import java.util.Map;

public class assignment_work3 {
	
	public static Map<Integer, String> userById = new HashMap<>(){{
		put(1,"田中");
		put(2,"鈴木");
		put(3,"山田");
	}};
	
	public static void main(String[] args) {
		try {
			System.out.println("登録されている名前は"+findUserById(3)+"さんです。");
		}catch (NullPointerException e) {
			System.out.println("登録されていません");
		}
	}
	
	public static String findUserById(int id) throws NullPointerException{		
		String userName = userById.get(id);

		if(userName == null) {
			throw new NullPointerException();
		}
		return userName;
	}
	
}
