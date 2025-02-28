package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Quiz4 {

	public static void main(String[] args) {

		Map<Integer, Student> map = new HashMap<Integer, Student>();

		Student student1 = new Student("둘리", 90, 80, 70);
		Student student2 = new Student("도우너", 55, 65, 75);
		Student student3 = new Student("또치", 80, 50, 50);

		map.put(1001, student1);
		map.put(1002, student2);
		map.put(1003, student3);

		// 학생 목록
		// Collection? List와 Set의 부모
		Collection<Student> values = map.values();
		System.out.println(values);

		// 학생별 총점과 평균점수
		// 변수 : 자료구조 (array, list, set, Collection)
		for (Student student : values) {
			// 총점
			int sum = student.kor + student.math + student.eng;
			// 평균
			double mean = sum / 3;

			System.out.println(student.name + "의 총점: " + sum);
			System.out.println(student.name + "의 평균: " + mean);
		}

		// 과목별 총점과 평균점수
		int korSum = 0;
		int mathSum = 0;
		int engSum = 0;

		for (Student student : values) {
			korSum = korSum + student.kor;
			mathSum = mathSum + student.math;
			engSum = engSum + student.eng;
		}

		System.out.println("국어의 총점: " + korSum + ", 국어의 평균: " + korSum / 3.0);
		System.out.println("수학의 총점: " + mathSum + ", 수학의 평균: " + mathSum / 3.0);
		System.out.println("영어의 총점: " + engSum + ", 영어의 평균: " + engSum / 3.0);

	}
}

class Student {

	int studentId;
	String name;
	int kor;
	int math;
	int eng;

	public Student(String name, int kor, int math, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng
				+ "]";
	}

}