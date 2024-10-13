package basicpgms;

public class Constructor1 {
    String  brand;
    int price;
    String color;
  }

class Constructor1Driver{
public static void main(String [] args)
{
	Constructor1 c1 = new Constructor1();
	System.out.println(c1.brand); 
	System.out.println(c1.price); 
	System.out.println(c1.color); 
	
	c1.brand = "cello";
	c1.price = 10;
	c1.color = "red";
	
	System.out.println("Color: "+ c1.color);
	System.out.println("Brand: "+ c1.brand);
	System.out.println("Price: "+ c1.price);
}
}