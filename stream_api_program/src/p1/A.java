package p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//
//public class A {
////map, filter, max, min , sorted etc.
//	//map: on each product price give me 10% discount this is map
//	public static void main(String[] args) {
//         ArrayList<Integer> data = new ArrayList<Integer>(); //there is write data its old the address of right side value  
//         data.add(100);
//         data.add(5);
//         data.add(30);
//         data.add(1);
//         
//         List<Integer> newList = data.stream().map(x->x*2).collect(Collectors.toList());
//         System.out.println(newList);
// 	}
//
//}

//public class A{
//	public static void main(String[] args) {
//      ArrayList<Integer> data = new ArrayList<Integer>(); //there is write data its old the address of right side value  
//      data.add(100);
//      data.add(5);
//      data.add(30);
//      data.add(1);
//      data.add(100);
//
//      
//      List<Integer> newList = data.stream().filter(x->x==100).collect(Collectors.toList());
//      System.out.println(newList);
//
//	}
//}
//

//public class A{
//	public static void main(String[] args) {
//      ArrayList<Integer> data = new ArrayList<Integer>(); //there is write data its old the address of right side value  
//      data.add(100);
//      data.add(5);
//      data.add(30);
//      data.add(1);
//      data.add(100);
//
//      
//      List<Integer> newList = data.stream().sorted().collect(Collectors.toList());
//      System.out.println(newList);
//
//	}
//}

//public class A{
//	public static void main(String[] args) {
//      ArrayList<Integer> data = new ArrayList<Integer>(); //there is write data its old the address of right side value  
//      data.add(100);
//      data.add(5);
//      data.add(30);
//      data.add(1);
//      data.add(100);
//
//      
//      int maxVal = data.stream().max(Comparator.comparing(s->s)).get();
//      System.out.println(maxVal);
//
//	}
//}
//

//public class A{
//	public static void main(String[] args) {
//      ArrayList<Integer> data = new ArrayList<Integer>(); //there is write data its old the address of right side value  
//      data.add(100);
//      data.add(5);
//      data.add(30);
//      data.add(1);
//      data.add(100);
//
//      
//      int minVal = data.stream().min(Comparator.comparing(s->s)).get();
//      System.out.println(minVal);
//
//	}
//}


public class A{
	public static void main(String[] args) {
		
	     
      ArrayList<String> data = new ArrayList<String>(); //there is write data its old the address of right side value  
      data.add("mike");
      data.add("adam");
      data.add("madam");
      data.add("eye");
      data.add("radar");
      

      List<String> isPalindrome = data.stream().filter(s->s.equals(new StringBuilder(s).reverse().toString())).collect(Collectors.toList());
      System.out.println(isPalindrome);

	}
}








