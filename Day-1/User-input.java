import java.util.*;
public class Hello1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInputScanner=new Scanner(System.in);
		System.out.print("What is your name?\n");
		String userInputName=userInputScanner.nextLine();
		System.out.println("Hello "+ userInputName +"!");
	}

}
