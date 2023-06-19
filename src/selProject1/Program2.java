package selProject1;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		int upper= 0;
		int lower= 0;
		int specialChar= 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Text");
		String s1= sc.nextLine();
		
		for(int i = 0;i<s1.length();i++) {
			
		if(s1.charAt(i) != ' ') {
			
			for(int k = 1;k<s1.length();k++) {
				
				if(s1.charAt(i) == s1.charAt(k)) {
					System.out.println("first repeated character " + s1.charAt(i));
					break;
				}
				else {
					System.out.println("first non repeated character "+ s1.charAt(i));
					break;
				}
				
			}
		}
		}
	
		
					}
				
			
			
		}
	
		
		
			
		
	


