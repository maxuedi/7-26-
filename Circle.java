package test;

public class Circle {
public double r;

public Circle(double r) {
	super();
	this.r=r;
} 
	public Circle() {
		
	}
public void getArea() {
	System.out.println("���Ϊ��"+Math.PI*r*r);
	}
public void getPerimeter() {
	System.out.println("�ܳ�Ϊ��"+Math.PI*2*r);
}


}
