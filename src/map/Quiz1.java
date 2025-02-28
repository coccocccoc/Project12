package map;

import java.util.HashMap;
import java.util.Map;

public class Quiz1 {

	public static void main(String[] args) {
		
		Map<Character, String> map = new HashMap<Character, String>();
		
		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('c', "코코넛");
		
		String value = map.get('b');
		System.out.println(value);
		System.out.println(map);
		
		map.replace('b', "블루베리");
		System.out.println(map);
		
		map.remove('a');
		System.out.println(map);


		
	}

}
