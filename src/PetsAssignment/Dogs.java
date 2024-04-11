package PetsAssignment;

import java.util.Scanner;

public class Dogs extends Pet {
	
	private String dogPrice;
	private String dogDesc;

	public Dogs() {
		// TODO Auto-generated constructor stub
	}

	public Dogs(String pid, String pt, String b, String d, String pr) {
		super(pid, pt, b, d, pr);
		// TODO Auto-generated constructor stub
	}
	
	public Dogs(String pid, String pt, String b, String d, String pr, String dp, String dd) {
		super(pid, pt, b, d, pr);
		this.dogDesc=dd;
		this.dogPrice=dp;
		// TODO Auto-generated constructor stub
	}

	public String getDogPrice() {
		return dogPrice;
	}

	public void setDogPrice(String dogPrice) {
		this.dogPrice = dogPrice;
	}

	public String getDogDesc() {
		return dogDesc;
	}

	public void setDogDesc(String dogDesc) {
		this.dogDesc = dogDesc;
	}
	
	@Override
	public String finalPrice() {
		return dogPrice;
	}

	@Override
	public void getDesc() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Description of Dogs:");
		dogDesc = sc.next();
	}

	@Override
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Price of Dogs:");
		dogPrice = sc.next();
	}

	@Override
	public String finalDesc() {
		// TODO Auto-generated method stub
		return dogDesc;
	}
	


}
