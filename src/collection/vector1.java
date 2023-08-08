package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector1 {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add("vidya");
		v1.add("snehal");
		v1.add(100);
		v1.add(400);
		v1.add('A');
		
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.contains(100));
		System.out.println(v1.isEmpty());
		System.out.println(v1.get(4));
		
		v1.add(500);
		{
			System.out.println(v1);
		}
		
		v1.remove(2);
		{
		System.out.println(v1);
		
		}
		
		Iterator s1 = v1.iterator();
		while(s1.hasNext())
		{
			System.out.println(s1.next());
		}
		
		ListIterator s2 = v1.listIterator();
		{
			System.out.println(s2);
		}
		
		for(int i=0;i<=v1.size()-1;i++)
		{
			System.out.println(v1.get(i));
		}
		for(Object s4:v1)
		{
			System.out.println(s4);
		}
		
		Enumeration s5 = v1.elements();
		while(s5.hasMoreElements());
		{
			System.out.println(s5.nextElement());
		}

}
}
