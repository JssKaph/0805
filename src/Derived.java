
public class Derived extends Base {
	String name = "박지민"; // overshadow variable
	void print() { // override method
		System.out.println("나는 자식의 메소드"); 
	}
	void display() { // 두명의 이름을 가져오고 싶을때
//		System.out.println(this.name); // this.name = 나의 이름
//		System.out.println(super.name); // super.name = 부모의 이름
		this.print();
		super.print();
	}
}

