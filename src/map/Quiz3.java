package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Quiz3 {

	public static void main(String[] args) {
		
		Map<String, Float> map = new HashMap<String, Float>();
		
		map.put("국어", 80.0f); // 식별자 f
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		// 과목명(key값)만 출력
		Set <String> ketset = map.keySet();
		System.out.println(ketset); // [국어, 수학, 영어]
		
		// 점수(value값)만 출력
		
		System.out.println(map.values()); // [80.0, 90.0, 100.0]

		
	}

}
