package map;

import java.util.HashMap;
import java.util.Map;

public class Quiz2 {

	public static void main(String[] args) {

		// HashMap 객체 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 데이터 추가
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		
		// 데이터 수정
		map.replace("국어", 50);
		map.replace("수학", 60);
		map.replace("영어", 70);
		
		// 데이터 삭제
		map.remove("영어");

		// map의 크기 출력
		System.out.println(map.size());
		
		// map의 요소 하나씩 출력
		System.out.println(map);

		
		

		
	}

}
