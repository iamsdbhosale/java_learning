/*
Collections in java
-------------------
Collection - To represent group of elements/objects/data into single entity

Collection is an interface available in java.util

ArrayList - is class which is implemented List interface
---------------
1. Heterogenious data - allowed
2. insertion order - preserved (Index)
3. Duplicate elements - allowed
4. multiple nulls - allowed
---------------
*/

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;


public class ArrayListDemo{
	public static void main(String[] args) {
	ArrayList mylist=new ArrayList();
	//adding data into arrayList
	mylist.add(100);
	mylist.add(10.5);
	mylist.add("Welcome");
	mylist.add('A');
	mylist.add(true);
	mylist.add(100);
	mylist.add(null);
	mylist.add(null);

	//size of ArrayList
	System.out.println("Size of an arraylist:"+mylist.size());
	
	//printing ArrayList
	System.out.println("Printing Data from ArrayList:"+mylist);
	
	//remove element from ArrayList
	mylist.remove(5); // 5 is index
	System.out.println("After removing:"+mylist);

	//insert element in the ArrayList
	mylist.add(2,"java");
	System.out.println("After insertion of new element:"+mylist);

	//modify element in the ArrayList (modify/replaace/change)
	mylist.set(2,"python");
	System.out.println("After modification:"+mylist);

	//Access specific element from ArrayList
	mylist.get(3);
	System.out.println("Printing Fourth Element:"+mylist.get(3));

	//reading all the elements from ArrayList
	//1. using normal for loop
	for(int i=0;i<mylist.size();i++)
	{
		//mylist.get(i);
		System.out.println(mylist.get(i));
	}

	System.out.println("\n");

	//2. using enhanced for loop - for..each loop
	for(Object x:mylist)
	{
		System.out.println(x);
	}

	System.out.println("\n");

	//using iterator  //import java.util.Iterator;
	Iterator <Object> it=mylist.iterator(); // <Object> optional here

	System.out.println(it.next()); // it displays first element of ArrayList
	System.out.println("\n");
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	//checking ArrayList is empty or not
	//mylist.isEmpty();
	System.out.println("Is ArrayList empty?"+mylist.isEmpty());

	//remove multiple elements from ArrayList
	ArrayList mylist2=new ArrayList();
	mylist2.add(100);
	mylist2.add("Welcome");

	mylist.removeAll(mylist2);
	System.out.println("After removing multiple elements"+mylist);

	//removing all elements or clear
	mylist.clear();
	System.out.println("Is ArrayList empty?"+mylist.isEmpty()); //true
	}
}