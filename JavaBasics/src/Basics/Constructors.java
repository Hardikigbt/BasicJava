package Basics;


public class Constructors {

//	Assignment 1:
	/*Output should be in the below sequence(using this keyword)
	just create one object
	Three parameterized constructor
	default constructor
	one parameterized constructor
	two parameterized constructor
	four parameterized constructor
	second use of this keyword--
	for calling from one method to another*/

	public Constructors() {
		this(1,2,3);
	System.out.println("Default Constructor");	}
		
	public Constructors(int a) {
		this();
		System.out.println("one parametrized constructor"); }

	public Constructors(int a,int b) {
		this(1);
		System.out.println("two parametrized constructor"); }
	
	public Constructors(int a,int b,int c) {
		System.out.println("three parametrized constructor"); }
	
	public Constructors(int a,int b,int c,int d) {
		this(1,2);
		System.out.println("four parametrized constructor");
		System.out.println("**************************************************"); }		
	
	public static void main(String[] args) {
		Constructors Cons = new Constructors(1,2,3,4);}}


	