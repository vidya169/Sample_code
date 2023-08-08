package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedList1 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add("vidya");
		l1.add("vidya");
		l1.add(200);
		l1.add('A');
		l1.add(null);
		l1.add(null);
		
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.contains(200));
		System.out.println(l1.get(1));
		System.out.println(l1.isEmpty());
		
		l1.add("snehal");
		System.out.println(l1);
		
		l1.set(3, 100);
		System.out.println(l1);
		
		l1.remove();
		System.out.println(l1);
		
		
		Iterator v1 = l1.iterator();
		while(v1.hasNext())
		{
			System.out.println(v1.next());
		}
		
		ListIterator v2 = l1.listIterator();
		while(v2.hasNext())
		{
			System.out.println(v2.next());
		}
		
		for(int i=0;i<=l1.size()-1;i++)
		{
			System.out.println(l1.get(i));
		}
		for(Object v3:l1)
		{
			System.out.println(v3);
		}
		}

}
