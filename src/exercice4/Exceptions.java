package exercice4;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
	          throw new ArithmeticException();
	        }catch(Exception e){
	          System.out.println("Catch");
	          throw new NullPointerException();
	        }finally{
	          System.out.println("Finally");
	          throw new NumberFormatException();
	        }

	}

}
