
public class InheritanceDemo {
	public static void main(String[] args) {
		ThreeD td = new ThreeD();
		td.print();
		
	}
}

class TwoD{
	int x=5;
	int y=10;
	public TwoD (){ // 생성자
		System.out.println("나는 TwoD"); // 부모의 클래스가 먼저 작동 되는걸 확인
	}
	void print() { //메소드
		System.out.printf("(x,y) = (%d, %d)\n ", this.x, this.y);
	}
}

class ThreeD extends TwoD{ // ThreeD는 TwoD를 상속받음 "extends"
	int z =100;
	// TwoD에 있는 x, y, print() 모두 사용 할 수 있다.
	// Three D에게 TwoD의 접근 권한을 주는 개념
	public ThreeD() {
		System.out.println("나는 ThreeD"); // 자식의 클래스가 나중에 작동
	}
}
