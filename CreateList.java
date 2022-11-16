package week3day2;

import java.util.ArrayList;
import java.util.List;

public class CreateList {
//Zara,Adam,Charlie,James,Ben}


public static void main(String[] args) {
	List<String> lst= new ArrayList <String>();
	lst.add("Adam");
	lst.add("Ben");
	lst.add("Zara");
	lst.add("Charlie");
	lst.add("James");
	lst.add("Ben");
	System.out.println(lst);
	System.out.println(lst.size());
	for (int i = 0; i < lst.size()-1; i++) {
		if(lst.get(i) == lst.get(i+1));
		System.out.println(lst.get(i));
		
	}
}
}
