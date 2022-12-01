package Collection_5;

import java.util.Collections;
import java.util.Vector;

/* WAP to store data related to item in Vector and after that sort the data.*/

public class Test5 {

	public static void main(String[] args) {

		Vector<Items5> v = new Vector<Items5>();
		v.add(new Items5(101, "pepsi", 90));
		v.add(new Items5(105, "coke", 65));
		v.add(new Items5(103, "Fanta", 80));
		v.add(new Items5(102, "Redbull", 100));
		v.add(new Items5(104, "Fruity", 30));

		Collections.sort(v, new IdComparator5());

		for (Items5 i : v)

			System.out.println(
					"Items Id: " + i.getItemId() + "  Items NAME:  " + i.getName() + "  Item price:  " + i.getPrice());
	}

}