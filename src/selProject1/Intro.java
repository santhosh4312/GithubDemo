package selProject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intro {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("hello");
		a.add("welcome");
		a.add("to");
		a.add("java");
		
		
		for(String s : a)
		 System.out.println(s);
		System.out.println("-----------");
			int i;
			for (i=0;i<a.size();i++) {
			System.out.println(a.get(i));
				
			}
			String[] name = {"john","doe","sam","paul"};
			List<String> nameArrayList = Arrays.asList(name);
			
			for(String s : name) {
				System.out.println(s);
			
			}
		 
		}
	}


