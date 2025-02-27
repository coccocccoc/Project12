package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Ex1 {

	public static void main(String[] args) {
		
		// interface = object
		// 부모타입 변수 = 자식 인스턴스
		// <K, V>: 제네릭 타입
		// key 타입, value 타입 (미정)
		// int형 키, String 값
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// 데이터 추가
		// map은 쌍으로 된 데이터를 저장한다
		map.put(1, "사과");
		map.put(2, "바나나");
		map.put(3, "코코넛");
		
		System.out.println(map);
		
		// 키로 데이터 꺼내기
		String str = map.get(1); // index X, key O
//		System.out.println(str); // 사과
		
		// 데이터 수정하기
		map.replace(2, "블루베리"); // 위치, 새로운 값
		System.out.println(map);
		
		// 데이터 삭제하기
		map.remove(1); // key
		System.out.println(map);
		
		// 크기 구하기
		System.out.println("map의 크기: " + map.size());

		// 키가 기억 안날때..
		// 키 목록 구하기
		// keySet: 키의 목록을 구하는 함수
		Collection<Integer> keys = map.keySet(); // Collection: list와 set의 부모
		System.out.println("키 목록: " + keys);
		
		// values: 값의 목록을 구하는 함수
		Collection<String> values = map.values();
		System.out.println("값 목록: " + values);
		
		// containsKey(키): map에 특정 키가 포함되었는지 확인하는 함수
		System.out.println(map.containsKey(2)); 
		
	}

}
