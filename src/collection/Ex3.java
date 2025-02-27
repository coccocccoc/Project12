package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set
public class Ex3 {

	public static void main(String[] args) {

		// 인터페이스 = 구현클래스
		// 부모타입 변수 = 자식 인스턴스
		Set<String> set = new HashSet<String>();

		// 데이터 추가
		set.add("둘리");
		set.add("또치");
		set.add("도우너");
		set.add("도우너"); // 추가 안됨 (중복 불가)

		System.out.println(set);
		// set은 데이터가 순서대로 저장되지 않음 (순서 없음)

		// set에 저장된 요소를 하나씩 꺼내기
		// index가 없어서 get 함수는 못씀

		Iterator<String> iterator = set.iterator();

//		iterator.hasNext(); // 다음 요소가 있는지 확인
//		iterator.next(); // 다음 요소 꺼내기
		while (iterator.hasNext()) { // 다음 요소가 있으면
			String str = iterator.next(); // 꺼내기
			System.out.println(str);
		}

		// 더 간단한 방법 (람다식 for문)
		// (변수 : 배열, 리스트, set)
		for (String str : set) {
			System.out.print(str + " ");
		}

		// 자료구조의 활용도
		// list > map > set

	}
}
