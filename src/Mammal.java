
public class Mammal extends Object{ // 모든 클래스는 Object의 자식임 (사실상 생략) 
		private String name;
//		public Mammal() {} 해결 방법 1
		public Mammal(String name) { // 해결 방법 2
			this.name = name;
	}
		public String getName() { // private 이기때문에 겟 네임 사용
			return this.name;
		}
}
