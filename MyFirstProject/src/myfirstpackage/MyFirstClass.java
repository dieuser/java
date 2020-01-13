package myfirstpackage;
import java.util.Scanner;

public class MyFirstClass {

	public static void main(String[] args) {
		
		String name=("Name");
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		name = in.nextLine();
		System.out.println("Hello "+name+" \nI hope you have lovely day!");
		

	}

}

