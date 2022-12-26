package week1.day1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Calculator {
public void addtwoNumbers() {
	int a=18;
	int b=6;
	System.out.println(a+b);
}
public void addthreeNumber() {
	int a=4;
	int b=5;
	int c=9;
	System.out.println(a+b+c);
			
}
public int mul(int a, int b) {
	return a*b;
	}
public void mul() {
	int a=9;
	double b=2.3d;
	System.out.println(a*b);
}
public void subtwoNumber() {
	int a=15;
	int b=10;
	System.out.println(a-b);

}
public double sub(double c,double d) {
	return c-d;
}
public void dividetwoNumbers() {
	int a=5;
	int b=2;
	System.out.println(a/b);
}
private void div() {
	int c=8;
	double d=2.2d;
	System.out.println(c/d);
}
public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.addtwoNumbers();
	calc.addthreeNumber();
	calc.mul();
	System.out.println(calc.mul(4, 8));
	calc.subtwoNumber();
	System.out.println(calc.sub(12.5d,10.5d));
	calc.dividetwoNumbers();
	calc.div();
}
}
