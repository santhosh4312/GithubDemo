package selProject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

import com.google.common.collect.ArrayListMultimap;

public class Arlist {

	public static void main(String[] args) {
		ArrayList <String>   named = new ArrayList<String>();
		named.add("Gopi");
		named.add("Krishna");
		named.add("Kumar");
		named.add("Venky");
		named.add("ravi");
		
//		for(int i=0;i<names.size();i++)
//		{
//			String actual = names.get(i);
//			if(actual.startsWith("A"))
//			{
//				System.out.println(actual);
//			}
		
		String[] name = {"Abhi","Vamsi","Aakash","Akhil","ravi","suresh"};
		List<String> names= Arrays.asList(name);
		
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		Stream<String> newnames = Stream.concat(named.stream(), names.stream());
//		newnames.sorted().forEach(s->System.out.println(s));
//		boolean flag = newnames.anyMatch(s->s.equalsIgnoreCase("Adam"));
//		System.out.println(flag);
//		Assert.assertTrue(flag);
		
		List<String> ls = Stream.of("Abhi","Vamsi","Aakash","Akhil","ravi","suresh","Donh","kill").filter(s->s.endsWith("h")).
				map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		
		List<Integer> values =  Arrays.asList(9,3,1,1,3,2,5,4,3,4,5,6);
		
		values.stream().distinct().forEach(s->System.out.println(s));
		
	}

}
