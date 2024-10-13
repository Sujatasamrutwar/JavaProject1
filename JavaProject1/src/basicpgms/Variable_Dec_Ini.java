package basicpgms;

public class Variable_Dec_Ini {
	static int a;	//Global Variable(Initialization)
	static int b=10;	//Global Variable(Initialization & Declaration)
	public static void main(String[] args) {
		int d=90;	//Local variable of main method
		System.out.println(b);	//90
		System.out.println(a);	//default value will be printed---->0
		System.out.println(d);  //assigned value will be printed------>10
		display();
		System.out.println("End of pgm");
	}
	public static void display() {
		int c=5;	//Local variable Declaration & Initialization
		System.out.println(c);
	}
}
