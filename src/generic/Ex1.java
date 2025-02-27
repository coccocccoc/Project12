package generic;

// 3D 프린트 클래스 만들기

// 재료
class Powder {
	public void doPrint() {
		System.out.println("Powder를 재료로 사용합니다");
	}
	public String toString() {
		return "재료는 Powder 입니다";
	}
}

class Plastic {
	public void doPrint() {
		System.out.println("Plastic을 재료로 사용합니다");
	}
	public String toString() {
		return "재료는 Plastic 입니다";
	}
}

// Powder를 재료로 사용하는 프린터기 만들기
class ThreeDPrinter1 {
	private Powder meterial; // 재료
	
	public void setMeterial(Powder powder) {
		this.meterial = powder;
	}
	
	public Powder getMeterial() {
		return this.meterial;
	}
}

// Plastic을 재료로 사용하는 프린터기 만들기
class ThreeDPrinter2 {
	private Plastic meterial; // 재료
	
	public void setMeterial(Plastic plastic) {
		this.meterial = plastic;
	}
	
	public Plastic getMeterial() {
		return this.meterial;
	}
}