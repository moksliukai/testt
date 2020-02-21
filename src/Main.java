	import java.util.Scanner;


	public class Main {

	    public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);

	        System.out.print("Iveskite trikampio krastine a: ");
	        int numberInt = Integer.parseInt(reader.nextLine());

	        System.out.print("Iveskite trikampio krastine b: ");
	        int numberIntOne = Integer.parseInt(reader.nextLine());
	        
	        System.out.print("Iveskite trikampio krastine c: ");
	        int numberIntTwo = Integer.parseInt(reader.nextLine());
	        
	        reader.close();
	        
	        System.out.println("Ivesta:  " + numberInt + ",  " + numberIntOne + ",  " + numberIntTwo + ";");
	        
	        int Perimetras = numberInt + numberIntOne + numberIntTwo;
	        
	        System.out.println("Gauta:  " + Perimetras); 


	}

}
