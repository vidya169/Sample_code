package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayList1 {
	public static void main(String[] args) {
		
		 ArrayList al=new ArrayList();
		 al.add("vidya");
		 al.add("snehal");
		 al.add(100);
		 al.add(null);
		 al.add(null);
		 al.add('A');
		 
		 System.out.println(al);
		 System.out.println(al.size());
		 System.out.println(al.contains(200));
		 System.out.println(al.get(1));
		 
		al.add(20.5f);
		 System.out.println(al);
		 
		 al.remove(1);
		 System.out.println(al);
		 
		 al.set(3, "abc");
		 System.out.println(al);
		 
		 System.out.println("======================");
		 
		 Iterator s1 = al.iterator();
		 while(s1.hasNext())
		 {
			 System.out.println(s1.next());
		 }
		
		 System.out.println("===================");
		 
		 
		 ListIterator s2 = al.listIterator();
		 while(s2.hasNext())
		 {
			 System.out.println(s2.next());
		 }
		 System.out.println("==========================");
		 
		 for(int i=0;i<=al.size()-1;i++)
		 {
			 System.out.println(al.get(i));
		 }
		 
		 System.out.println("=====================");
		 
		 for(Object v1:al)
		 {
			 System.out.println(v1);
		 }
			 
	 
		 }
		 
				
	}


