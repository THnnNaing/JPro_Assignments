package PetsAssignment;

import java.util.Scanner;

public class CatBritishShortHair extends Cats {
	
	private String CBSprice;
	private String CBSdesc;

	public CatBritishShortHair() {
		// TODO Auto-generated constructor stub
	}

	public CatBritishShortHair(String pid, String pt, String b, String d, String pr) {
		super(pid, pt, b, d, pr);
		// TODO Auto-generated constructor stub
	}

	public CatBritishShortHair(String pid, String pt, String b, String d, String pr, String cp, String catDesc) {
		super(pid, pt, b, d, pr, cp, catDesc);
		// TODO Auto-generated constructor stub
	}
	
	public CatBritishShortHair(String pid, String pt, String b, String d, String pr, String cp, String catDesc, String cbsP, String cbsD) {
		super(pid, pt, b, d, pr, cp, catDesc);
		this.CBSprice=cbsP;
		this.CBSdesc=cbsD;
		// TODO Auto-generated constructor stub
	}

	public String getCBSprice() {
		return CBSprice;
	}

	public void setCBSprice(String cBSprice) {
		CBSprice = cBSprice;
	}
	
    public String getCBSdesc() {
		return CBSdesc;
	}

	public void setCBSdesc(String cBSdesc) {
		CBSdesc = cBSdesc;
	}

	@Override
	public String finalPrice() {
		return CBSprice;
	}
	
	@Override
	public void getDesc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Extra Description of British Short Hair Cats:");
		CBSdesc = sc.next();
	}
	
	@Override
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Price of British Short Hair Cats:");
		CBSprice = sc.next();
	}
	
	@Override
	public String finalDesc() {
		// TODO Auto-generated method stub
		 return  CBSdesc;
	}

}
