package PetsAssignment;

import java.util.Scanner;

public class rabbit extends Pet {
	
	private String rabbitPrice;
	private String rabbitDesc;

	public rabbit() {
		// TODO Auto-generated constructor stub
	}

	public rabbit(String pid, String pt, String b, String d, String pr) {
		super(pid, pt, b, d, pr);
		// TODO Auto-generated constructor stub
	}

	public rabbit(String pid, String pt, String b, String d, String pr, String rp, String rd) {
		super(pid, pt, b, d, pr);
		this.rabbitPrice=rp;
		this.rabbitDesc=rd;
		// TODO Auto-generated constructor stub
	}

	public String getRabbitPrice() {
		return rabbitPrice;
	}

	public void setRabbitPrice(String rabbitPrice) {
		this.rabbitPrice = rabbitPrice;
	}

	public String getRabbitDesc() {
		return rabbitDesc;
	}

	public void setRabbitDesc(String rabbitDesc) {
		this.rabbitDesc = rabbitDesc;
	}
	
	@Override
	public String finalPrice() {
		return rabbitPrice;
	}

	@Override
	public void getDesc() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Description of Rabbits:");
		rabbitDesc = sc.next();
	}

	@Override
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Price of Rabbits:");
		rabbitPrice = sc.next();
	}

	@Override
	public String finalDesc() {
		// TODO Auto-generated method stub
		return rabbitDesc;
	}

}
