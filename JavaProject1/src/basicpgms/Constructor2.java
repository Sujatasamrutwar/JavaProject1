package basicpgms;

public class Constructor2 {
    String Bookname;
    int Bookprice;
    String Author;
    int pages;   

public void bookinfo(){
    System.out.println("Name of Book: "+ Bookname);
    System.out.println("Book Price: "+ Bookprice);
    System.out.println("Book Author: "+ Author);
    System.out.println("No of pages: "+ pages);
	}

class BookDriver{
	public static void main(String[] args) {
		Constructor2 c2 = new Constructor2();
		c2.Bookname = "Wings of Fire";
		c2.Bookprice = 399;
		c2.Author = "A P J kalam";
		c2.pages = 200;
		
		c2.bookinfo();
	}
}

}