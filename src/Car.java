import java.util.Date;

// 클래스
public class Car {
	private String name;
	private int price;
	private String maker;
	private Date today;
	private final double PI; // 상수
	// 각 멤버변수의 초기화는 생성자가 해야한다.
	
	//생성자
	public Car(String name, int price, String maker) {
//		super(); 있든 없든 상관없음
		this.name = name;
		this.price = price;
		this.maker = maker;
//		this.PI=3.141596; // 상수 초기화도 생성자가 가능
		System.out.println("방금 객체가 생성되었습니다.");
	}
	{ 	/*초기화 블록 Initialization Block
		 *괄호가 없어서 파라미터를 못넘긴다.
		 *이름이 없어서 한번만 실행
		 *생성자보다 먼저 실행 됨
		 */
		System.out.println("Hello World");
		this.today = new Date(); // 자동차와 관련 x 생성자로 값을 안줄것
		this.PI=3.141596;
	}
	@Override //부모에게 물려받은 toString을 재정의
	public String toString() {
		return "오늘은 "+this.today + "입니다.";
	}
}
/*
 * 생성자의 역할은 멤버 변수 또는 멤버 상수의 초기화
 * 생성자를 통해서 또는 Initialization Block을 통해서 초기화 한다.
 */
