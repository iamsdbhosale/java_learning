/*
This can be used in DataDriven Testing
*/

import java.util.Map;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo{
	public static void main(String[] arg){
	//declaration
    //HashMap hm=new HashMap();
    //Map hm=new HashMap();
    HashMap<Integer,String> hm=new HashMap<Integer,String>();

    //Adding pairs
    hm.put(101,"Sachin");
    hm.put(102,"Seema");
    hm.put(103,"Pooja");
    hm.put(104,"Ganesh");
    hm.put(101,"Tanmay");
    
    //printing HashMap
    System.out.println("Printing HashMap"+hm); //{101=Tanmay, 102=Seema, 103=Pooja, 104=Ganesh}

    //printing size of HashMap
    System.out.println("Size of a HashMap:"+hm.size()); //4

    //remove pair
    hm.remove(103); //103 is key of the pair
    System.out.println("After removing pair printing HashMap"+hm); //{101=Tanmay, 102=Seema, 104=Ganesh}

    //access value of the key
    System.out.println(hm.get(102)); //102 is key of the pair //Seema

    //get all the keys from HashMap
    System.out.println(hm.keySet()); //[101, 102, 104]

    //display all values of HashMap
    System.out.println(hm.values()); //[Tanmay, Seema, Ganesh]
    
    //to display key along with values
    System.out.println(hm.entrySet());  //[101=Tanmay, 102=Seema, 104=Ganesh]


//Reading data from HashMap
//using for..each
for(int k:hm.keySet())
{
	System.out.println(k+"   "+hm.get(k));
}


//using Iterator
Iterator<Entry<Integer,String>>it=hm.entrySet().iterator();

while(it.hasNext())
{
	Entry<Integer,String> entry=it.next();
	System.out.println(entry.getKey()+"   "+entry.getValue());
}

//to clear everything from HashMap
hm.clear();
System.out.println(hm.isEmpty()); //true

	}

}