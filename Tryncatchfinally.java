package Exceptionhandling_concept;

public class Tryncatchfinally {
	public static void main(String[] args) {
		System.out.println("***Main starts***");
		try{
			int i=1/0;//throw new Arith...!
		}
		catch(ArrayIndexOutOfBoundsException e)//=new Arith...();
		{
			System.out.println("caught...");
		}
		finally{
			System.out.println("It's finally block...");
		}
		System.out.println("***Main ends***");
	}

}
