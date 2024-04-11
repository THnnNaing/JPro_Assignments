package PetsAssignment;

import java.util.Scanner;

public class Fishes extends Pet {
	
	private String fishesPrice;
	private String fishesDesc;

	public Fishes() {
		// TODO Auto-generated constructor stub
	}

	public Fishes(String pid, String pt, String b, String d, String pr) {
		super(pid, pt, b, d, pr);
		// TODO Auto-generated constructor stub
	}

	public Fishes(String pid, String pt, String b, String d, String pr, String fp, String fd) {
		super(pid, pt, b, d, pr);
		this.fishesDesc=fd;
		this.fishesPrice=fp;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String finalPrice() {
		return fishesPrice;
	}

	@Override
	public void getDesc() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Description of Fishes:");
		fishesDesc = sc.next();
	}

	@Override
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Price of Fishes:");
		fishesPrice = sc.next();
	}

	@Override
	public String finalDesc() {
		// TODO Auto-generated method stub
		return fishesDesc;
	}

}
