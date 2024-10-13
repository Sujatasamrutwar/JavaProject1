package basicpgms;

public class MethodShadowing {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.display();
		System.out.println(p.num);
		
		Child c=new Child();
		c.display();
		System.out.println(c.num);
		
		//upcasting
		p=c;
		p.display();
		System.out.println(p.num);
		
		//downcasting
		Child c1=(Child)p;
		c1.display();
		System.out.println(c1.num);
		
		//upcasting
		Parent p1=new Child();
		p1.display();
		System.out.println(p1.num);
//		c=(Child)p1;
//		c.display();
	}
}
