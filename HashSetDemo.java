/*
Hashset - a class implemented set interface
-----
1. Heterogenious data - allowed
2. insertion order - Not preserved (Index not supported)
3. Duplicate elements - not allowed
4. multiple nulls - not allowed | Only single null is allowed
*/


import java.util.HashSet;
import java.util.ArrayList;

import java.util.Iterator;

public class HashSetDemo{
	public static void main(String[] args){
	//Declaration 
	HashSet myset=new HashSet();
	//Set myset=new HashSet();
	//HashSet <String>myset=new HashSet<String>();

    //Adding elements in to HashSet
    myset.add(100);
    myset.add(10.5);
    myset.add("welcome");
    myset.add('A');
    myset.add(100);
    myset.add(null);
    myset.add(null);

    //Displaying elments
    System.out.println(myset); //output : [null, A, 100, 10.5, welcome]
    //size of hashset
    System.out.println("Size of hashset:"+myset.size());


    //removing element
    myset.remove(10.5); // 10.5 is value
    System.out.println("After removing:"+myset);

    //inserting element - not possible
    //Accessing specific elements - is not possible

    //convert HashSet-->ArrayList
    ArrayList al=new ArrayList(myset);
    System.out.println("printing al which is set:"+al);

    //Accessing specific elements from HashSet
    System.out.println(""+al.get(2));

    //Read all the elements for..each loop
    System.out.println("printing with for each loop");
    for(Object x:myset)
    {
	    System.out.println(x);
    }

//using Iterator
System.out.println("printing with Iterator");
Iterator <Object> it=myset.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}


//clearing all the elements in HashSet
myset.clear();
System.out.println(myset.isEmpty()); // true


	}
}