package basicpgms;

public class Fruit {
  String name;
  int price;
  String color;
  String taste;
  
  Fruit()
  {
  }
  
  Fruit(String name, int price, String color)
  {
	  this.name=name;
	  this.price=price;
	  this.color=color;
  }
  
  
  Fruit(String name, int price, String color, String taste)
  {
	  this(name,price,color);
	  this.taste=taste;
  }
  
  public void display()
  {
	  System.out.println("Name: "+name);
      System.out.println("Price: "+price);
      System.out.println("Color: "+color);
      System.out.println("Taste: "+taste);
}
  
}
