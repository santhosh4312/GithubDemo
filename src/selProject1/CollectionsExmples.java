package selProject1;

import java.util.ArrayList;

public class CollectionsExmples {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		
		a.remove("4");
		
		System.out.println(a);
	}

}
