package selProject1;

public class Employe {
	private int id;
	public String name;
	protected double salary;
	
	public Employe() {
		
	}
	public Employe(int id) {
		this.id= id;
	}
	
	public void setID(int id) {
		this.id= id;
	}
	
		public int getID() {
			return id;
		}
	
}
