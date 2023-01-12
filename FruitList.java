package collection;
import java.util.*;
public class FruitList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> fruits=new ArrayList<String>();
fruits.add("Apple");
fruits.add("Orange");
fruits.add("Grapes");
fruits.add("Mango");
fruits.remove("Grapes");

System.out.println(fruits.get(1));
System.out.println(fruits);
System.out.println(fruits.contains("Banana"));
System.out.println(fruits.isEmpty());
System.out.println(fruits.size());// to print size
//Traversing  
Iterator itr=fruits.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next()+ " ");
}
for (String i:fruits) {
	System.out.println(i);
}
}  
}
