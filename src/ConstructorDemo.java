
public class ConstructorDemo {
	public static void main(String[] args) {
//		Car c = new Car(); //생성자가 있기때문에 기본생성자 안됨
		Car c = new Car("Sonata", 30_000_000, "Hyundae Motors"); // 파라미터로 바로 Car를 만들면서 바로 선언
		System.out.println(c); // c.toString() 똑같다
	}
}
