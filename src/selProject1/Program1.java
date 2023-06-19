package selProject1;

public class Program1 {

	public static void main(String[] args) {
		
		Employe emp1= new Employe();
		emp1.setID(101);
		emp1.name="neo";
		emp1.salary=76458.98;
		
		Employe emp2= new Employe();
		emp2.setID(102);
		emp2.name="leo";
		emp2.salary=76400.00;
		
		Employe emp3= new Employe();
		emp3.setID(103);
		emp3.name="john";
		emp3.salary=73338.98;
		
		Employe[] employees= new Employe[] {emp1,emp2,emp3};
		System.out.println(employees);
		
	}

}
