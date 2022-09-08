package Basics;

public class Const2 {
	/* Assignment2--
	Output should be in the below sequence(using this keyword)
	Three parameterized method
	Default method
	two parameterized method
	four parameterized method
	one parameterized method */

	public void method() {

		this.method3();	
		this.method0();
		this.method2();
		this.method4();
		this.method1();   }
	
	public void method1() {
		
	System.out.println("one parametrized Method"); 
	System.out.println("****************************"); }
	
	public void method2() {
		
	System.out.println("two parametrized Method"); }

	public void method3() {
		
	System.out.println("three parametrized Method"); }
		
	public void method4() {
		
	System.out.println("four parametrized Method");
	 }		
	public void method0() {
		System.out.println("Default Method");
	}
	public static void main(String[] args) {
		Const2 Assi2 = new Const2();
		Assi2.method();
	}
}
