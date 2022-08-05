
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = new Employee();
		
		System.out.println(e.salary); // Manager의 Salary를 접근하여 사용

	}
}
class Manager { // Employee의 부모
	int salary = 1_000_000;
}

class Employee extends Manager{ // Employee는 Manager의 자식
	String name = "한지민";
}
