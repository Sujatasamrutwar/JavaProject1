package basicpgms;

public class Watch {
   String brand;
   int price;
   String strap;
   
   Watch()
   {
   }
   
  Watch(String brand, int price, String strap)
  { 
	  this.brand = brand;
	  this.price = price;
	  this.strap = strap;
   }
  
  public void display()
  {
	  System.out.println("Brand: "+ brand);
	  System.out.println("Price: "+ price);
	  System.out.println("Strap: "+ strap);
  }
  }

