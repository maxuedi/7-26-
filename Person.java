package test;

public class Person {
public int age;
public String name;
public Person(int age,String name) {
	super();
	this.age = age;
	this.name = name;
}
public Person() {
	
}
public void display() {
	System.out.println("���䣺"+age+"������"+name);
}
public static void main(String[] args) {
	Person person = new Person(18,"ziji");
	person.display();
}
}//
