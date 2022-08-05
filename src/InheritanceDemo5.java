/*
 * 상속시 주의할 점
 * 4. 같은 이름을 가진 리소스는 상속되지 않는다.
 * 		-overshadow 변수 : 같은 이름의 변수
 * 		-override method : 같은 이름의 메소드, 재정의
 */
public class InheritanceDemo5 {
	public static void main(String[] args) {
		Derived d = new Derived();
//		System.out.println(d.name); // name이 있기 때문에 자식인 "박지민"만 가져옴.
//		d.print(); // 자식의 메소드만 가져옴
		d.display();
	}
}
