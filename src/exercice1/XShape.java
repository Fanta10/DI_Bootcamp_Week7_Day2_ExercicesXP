package exercice1;

public class XShape extends Shape{
	
	private String name;
	
	
	

	public XShape(String name) {
		super();
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return super.getName() + "  , " + this.name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XShape circle = new XShape("Circle");
		
		System.out.println(circle.getName());
		

	}

}
