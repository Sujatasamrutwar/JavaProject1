package basicpgms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupFromCollection {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(12);
		l.add("hello");
		l.add("Bye");
		l.add("bye");
		l.add("hello");
		l.add(1);
		l.add(2);
		l.add(1);
		
		System.out.println("Arraylist:"+l);
		
		Set s=new HashSet(l);
		System.out.println("Duplicate removed:"+s);
	}
}
