/*
 * 상속시 주의할 점
 * 1. 생성자는 상속되지 않는다. 
 * - 자식 생성자는 항상 부모의 기본생성자만 호출하기 때문이다.
 * - 만일 부모의 생성자가 없다면 에러 발생
 * > 해결 방법 1) 부모쪽에 기본 생성자를 만들어줌 (자식클래스는 부모클래스의 기본생성자만 호출하기 때문에)
 * > 해결 방법 2) 기본생성자가 아닌 다른생성자를 호출 할때 super(생성자가 원하는 객체) 메소드 사용
 * 	- super() 메소드 주의할 점
 * 		-- 생성자 안에서만 사용하고, 반드시 생성자안에서 첫줄에 와야 한다.
 *  final 클래스는 상속이안된다. (api 확인)
 * 
 */
public class InheritanceDemo2 {
	public static void main(String[] args) {
		Lion lion = new Lion("Lion King", 26);
		System.out.println(lion);
	}
}
