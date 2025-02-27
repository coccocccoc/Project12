package collection;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		// Character 타입의 ArrayList 생성
		ArrayList<Character> list = new ArrayList<Character>();

		// 문자 3개 추가
		list.add('A');
		list.add('B');
		list.add('C');

		// 리스트의 요소 하나씩 출력
		for (Character character : list) {
			System.out.println(character);
		}

		// 리스트에서 두번째 문자 B 삭제
		list.remove(1);

		// 리스트의 크기 출력
		int size = list.size();
		System.out.println(size);

	}

}
