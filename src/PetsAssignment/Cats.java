package PetsAssignment;

import java.util.Scanner;

public class Cats extends Pet {

	private String catPrice;
	private String catDesc;
	
	public Cats() {
		// TODO Auto-generated constructor stub
	}

	public Cats(String pid, String pt, String b, String d, String pr) {
		super(pid, pt, b, d, pr);
		// TODO Auto-generated constructor stub
	}
	
	public Cats(String pid, String pt, String b, String d, String pr, String cp, String catDesc) {
		super(pid, pt, b, d, pr);
		this.catPrice=cp;
		// TODO Auto-generated constructor stub
	}
	
	public String getCatPrice() {
		return catPrice;
	}

	public void setCatPrice(String catPrice) {
		this.catPrice = catPrice;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	@Override
	public String finalPrice() {
		return catPrice;
	}

	@Override
	public void getDesc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Description of Cats:");
		catDesc = sc.next();
	}

	@Override
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Price of Cats:");
		catPrice = sc.next();
	}

	@Override
	public String finalDesc() {
		// TODO Auto-generated method stub
		return catDesc;
	}

}
