package PetsAssignment;

import java.util.Scanner;

public class MainPetShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetShop p= new PetShop(10);
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
			p.PMS();
			System.out.println("Continue or not (y|n) ?:");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}

}
