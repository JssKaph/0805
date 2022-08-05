
public class Lion extends Mammal{
	private int age;
	
	public Lion(String name, int age) { // 메인에서 두가지 값을 받음
		super(name); // name은 부모에게 보냄
		this.age = age;
	}
	
	@Override // 재정의
	public String toString() {
		return "이름은" + getName() + ", 나이는" + this.age;
	}
}
