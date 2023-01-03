package pro19.com.spring.ex02;

import pro19.com.spring.ex01.PersonService;

public class PersonServiceImpl implements PersonService {
	private String name;
	private int age;

	public PersonServiceImpl(String name) {
		this.name = name;
	}

	public PersonServiceImpl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void sayHello() {
		System.out.println("ÀÌ¸§: " + name);
		System.out.println("³ªÀÌ: " + age + "»ì");
	}
}