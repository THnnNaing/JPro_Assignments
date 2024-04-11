package PetsAssignment;

import java.util.Scanner;

public class DogShiba extends Dogs {
	
	private String SDprice;
	private String SDdesc;

	public DogShiba() {
		// TODO Auto-generated constructor stub
	}

	public DogShiba(String pid, String pt, String b, String d, String pr) {
		super(pid, pt, b, d, pr);
		// TODO Auto-generated constructor stub
	}

	public DogShiba(String pid, String pt, String b, String d, String pr, String dp, String dd) {
		super(pid, pt, b, d, pr, dp, dd);
		// TODO Auto-generated constructor stub
	}
	
	public DogShiba(String pid, String pt, String b, String d, String pr, String dp, String dd, String sdP, String sdD) {
		super(pid, pt, b, d, pr, dp, dd);
		this.SDprice=sdP;
		this.SDdesc=sdD;
		// TODO Auto-generated constructor stub
	}

	public String getSDprice() {
		return SDprice;
	}

	public void setSDprice(String sDprice) {
		SDprice = sDprice;
	}

	public String getSDdesc() {
		return SDdesc;
	}

	public void setSDdesc(String sDdesc) {
		SDdesc = sDdesc;
	}
	@Override
	public String finalPrice() {
		return  SDprice;
	}
	
	@Override
	public void getDesc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Extra Description of Shiba Dogs:");
		SDdesc = sc.next();
	}
	
	@Override
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Price of Shiba Dogs:");
		SDprice = sc.next();
	}
	
	@Override
	public String finalDesc() {
		// TODO Auto-generated method stub
	    return  SDdesc;
	}
	


}
