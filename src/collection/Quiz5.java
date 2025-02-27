package collection;

import java.util.HashSet;
import java.util.Set;

public class Quiz5 {

	public static void main(String[] args) {

		// 정수 타입의 HashSet 생성
		Set<Integer> set = new HashSet<Integer>();

		// set에 숫자 추가
		set.add(2);
		set.add(4);
		set.add(7);

		// set의 크기 추가
		System.out.println(set.size());

		// 람다식 for문을 사용해 set의 요소 하나씩 출력
		for (Integer integer : set) {
			System.out.print(integer + " ");
		}

	}

}
