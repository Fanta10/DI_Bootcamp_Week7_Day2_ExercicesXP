package exercice3;

public class Customer {
	private int ID;
	private String name;
	private char gender;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int iD, String name, char gender) {
		super();
		ID = iD;
		this.name = name;
		this.gender = gender;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	

}
