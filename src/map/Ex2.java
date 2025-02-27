package map;

import java.util.Collection;
import java.util.HashMap;

// Map을 이용하여 쇼핑몰 회원 관리 프로그램 구현
public class Ex2 {

	public static void main(String[] args) {

		// key, value
		// key: int, value: Member
		// 회원 목록을 저장하는 map 생성
		// Key: 데이터를 구분하기 위한 식별자
		// Value: 실제로 관리하고 싶은 데이터
		HashMap<Integer, Member> map = new HashMap<Integer, Member>();

		// map은 쌍으로 된 데이터를 저장한다
		// key는 중복 불가, value는 중복 가능
		map.put(1001, new Member(1001, "둘리"));
		map.put(1002, new Member(1002, "또치"));
		map.put(1003, new Member(1003, "도우너"));

		System.out.println(map);

		// key를 입력하여 삭제
		map.remove(1001);
		System.out.println(map);

		// map 크기
		System.out.println(map.size());

		// 키 목록
		Collection<Integer> keys = map.keySet();
		System.out.println(keys);

		// 값 목록
		Collection<Member> values = map.values();
		System.out.println(values);

	}
}

class Member {

	int memberId; // 회원번호
	String mamberName; // 회원이름

	// 모든 멤버변수를 초기화하는 생성자
	public Member(int memberId, String mamberName) {
		super();
		this.memberId = memberId;
		this.mamberName = mamberName;
	}

	// Object 클래스에서 물려받은 toString 메소드를 재정의
	// 주소 -> 데이터
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", mamberName=" + mamberName + "]";
	}

}
