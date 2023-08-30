package JavaStudy;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionStudy {

	public static void main(String[] args) {
		//Array list-duplicate allowed , null value allowed , order or insertion maintain
		
		ArrayList al=new ArrayList();
		al.add("Ajay");
		al.add("Rokade");
		al.add("Rokade");
		al.add("Rokade");
		al.add("Rokade");
		al.add("Rokade");
		al.add('A');
		al.add(12.5);
		al.add(15);
		al.add(15);
		al.add(15);
		al.add(true);
		System.out.println(al);
		System.out.println(al.size());//12
		System.out.println(al.addAll(al));//true
		System.out.println(al.contains('B'));//false
		System.out.println(al.equals("Ajay"));//false
		System.out.println(al.get(7));//12.5
		System.out.println(al.indexOf("Rokade"));//1
		System.out.println(al.indexOf("Ajay"));//0
		System.out.println(al.lastIndexOf(12.5));//19

		
		
		for(Object o:al)
		{
			System.out.println(o);
		}
	}

}
