package com.bit.mySelf01;

//Student 클래스의 필드를 정의하는부분
//이렇게 필드를 정의 하고  java.lang.Object의 메소드를 해당 필드에 맞추어
//오버라이딩하는 메소드만 들어갑니다
//이렇게 데이터를 담당하는 틀을 우리는 Value Object 혹은 Data Transfer Object를 줄여서
//VO 혹은 DTO 클래스라고 부릅니다
//즉 이클래스의 이름은 StruedntVO클래스가 되어야합니다

//더이상 우리가 코딩을 할때 꼭 외부가 알아야 하는 메소드가 아니면
//모두다 private 접근제한자를 설정하게됩니다.
//하지만 private 접근 제한자는 외부 클래스의 접근을 다 막기때문에 
//해당 필드 혹은 메소드를 아예 접근 할 수 없습니다
//만약 해당 메소드가 이 클래스에서만 사용되면 상관이 없지만
//만약 외부 클래스에서 필드의 값을 넣으려면
//더이상 직접 접근이 불가능해집니다
//대신 우리는 메소드를 만들어
//그 메소드들한테 값을 넣거나 빼게 만들어 주어야 합니다.

//이렇게 외부에 클래스 내부를 전부다 공개하는게 아니라
//정말정말 꼭 필요한 메소드만 공개하게 모든 접근제한자를 private으로 넣고
//메소드들로만 관리하게 만드는것을 캡슐화라고 합니다.
public class StudentVO {
	String name;
	private int korean;
	private int english;
	private int math;
	private int id;

	// 필드에 값을 넣는 메소드는 우리가 setter 메소드라고 합니다
	// 필드의 현재값을 출력하는 메소드는 우리가 getter메소드라고 합니다
	// 단 출력은 화면에 출력을 뜻하는게 아니라 그 값 자체를 리턴한다는 의미 입니다.
	// 셋터 메소드는 이렇게 생겼습니다
	// public void set필드명(필드타입 필드이름){
	// this.필드 = 필드;
	// }
	public void setName(String name) {
		this.name = name;
	}

	// 겟터메서드는 이렇게 생겼습니다
	// public 필드타입 get필드명(){
	// return 필드이름;
	// }
	public String getNane() {
		return name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	// equals 메서드는
	// 파라미터로 모든 클래스의 객체가 넘어올수 있습니다.
	// 그럼 어떻게 해야 우리가 모든 클래스 객체를 파라미터로 받는
	// 메서드를 선언할수 있을까?
	// 1.모든 클래스를 전부다 오버로딩해줍니다.
	// 2.다형성을 사용합니다.
	public boolean equals(Object o) {
		// 2개의 객체를 비교할떄 같은지 알아볼려면
		// 1. 2개의 객체가 같은 클래스 객체인지 확인해본다.
		// 2. 2개의 객체가 같은 클래스 객체이면 해당 클래스의 필드중 특정 필드 혹은
		// 모든 필드를 비교해서 모두다 같으면 두개가 같은 객체입니다.

		// 먼저 2 객체가 같은 클래스 객체인지 알아봅니다.
		// 좀더 자세하게 말하자면 파라미터로 넘어온 o가
		// null이 아니고 StuentVO 클래스의 객체인지 확인해봅니다.
		// 여기서 간단하게 예약어 하나로 2개를 동시에 확인할수 있습니다
		if (o instanceof StudentVO) {
			// 이 if문 안에 들어 왔다는것은 parameter로 넘어온 Object o가
			// StudentVO 클래스의 객체란 뜻이므로
			// 우리는 StudentVO의 필드를 꺼낼수있습니다
			// 하지만 Object o이기 때문에 그 필드들을 o에서 꺼내올수는 없고
			// 대신 명시적 형변환을 통해서 StudentVO 객체에 덮어씌울수 있습니다.
			StudentVO s = (StudentVO) o;
			if (id == s.id) {
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "학번: " + id + ", 이름: " + name + ", 국어점수: " + korean + ", 수학점수: "
				+ math + ", 영어점수: " + english;
	}

}
