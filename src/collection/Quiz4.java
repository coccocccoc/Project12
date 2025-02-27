package collection;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();

		memberArrayList.addMember(new Member(1001, "둘리"));
		memberArrayList.addMember(new Member(1002, "또치"));
		memberArrayList.addMember(new Member(1003, "도우너"));
		memberArrayList.addMember(new Member(1004, "고길동"));

		memberArrayList.showAllMember();

		System.out.println();

		System.out.println("MemberArrayList에 1004번 회원이 있으면 삭제");
		memberArrayList.removeMember(1004);
		memberArrayList.showAllMember();

	}

}

class MemberArrayList {

	ArrayList<Member> list; // 회원 리스트 선언

	// 생성자: 인스턴스 생성 및 멤버변수 초기화
	public MemberArrayList() {
		list = new ArrayList<Member>(); // 리스트 생성
	}

	// 리스트에 새로운 회원을 추가하는 함수
	public void addMember(Member member) {
		list.add(member);
	}

	// 회원 아이디로 회원을 삭제하는 함수
	// 매개변수: memberId
	// 리스트에서 회원을 하나씩 꺼내서 학번이 맞는지 비교
	public void removeMember(int memberId) {
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			if (member.memberId == memberId) {
				list.remove(i);
				System.out.println(memberId + "번 학생이 삭제되었습니다.");
				return;
			}
		}
		System.out.println(memberId + "번 학생이 존재하지 않습니다.");
	}

	public void showAllMember() {

		for (Member member : list) {
			System.out.println(member);
		}
	}

}