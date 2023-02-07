package exercice2;

public class Point2D {
	private float x = 0.0f;
	private float y = 0.0f;
	public Point2D() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Point2D(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public float[] getXY() {
		
		float[] tab =  new float[2];
		tab[0] = x;
		tab[1] = y;
		return tab;
	}
	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
		
	}	
	
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	
	
	}


