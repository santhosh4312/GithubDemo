package selProject1;

public class Program5 {

	public static void main(String[] args) {
		
		for(int i = 1;i<5;i++) {
			System.out.println(i);
			for(int k = 6;k<10;k++) {
				System.out.println(k);
				if(k==8) {
					break;
				}
			}
		}

	}

}
