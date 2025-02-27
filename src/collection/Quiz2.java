package collection;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();

		list.add('A');
		list.add('B');
		list.add('C');

		// contains: 리스트 안에 특정값이 포함되어있는지 확인하는 함수
		System.out.println(list.contains('A')); // true

		if (list.contains('A')) {
			// indexOf: 특정 값의 인덱스를 찾는 함수
			int index = list.indexOf('A');
			System.out.println(index);
			list.remove(index);
		}

//		for(int i = 0; i < list.size(); i++) {
//			char ch = list.get(i);
//			if(ch == 'A') {
//				list.remove(i);
//			}
//		}

		System.out.println(list);

	}

}
