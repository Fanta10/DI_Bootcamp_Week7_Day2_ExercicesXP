package exercice2;

public class Point3D extends Point2D{
	private float z = 0.0f;

	public Point3D() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point3D(float x, float y, float z) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	public float[] getXYZ() {
		
		float[] tab = new float[3];
		tab[0]= this.getX();
		tab[1]= this.getY();
		tab[2]= this.getZ();
		return tab;
		
	}
	public void setXYZ(float x, float y, float z) {
		setXY(x,y);
		this.z = z;;
		
		
	}	

	@Override
	public String toString() {
		return "Point3D [z=" + z + 
				  "x =" + this.getX() + "y =" + this.getY() + " ]";
	}
	
	

	
	
	
	

}
