package PetsAssignment;

import java.util.Scanner;

public class Birds extends Pet {

    private String birdPrice;
    private String birdDesc;

    public Birds() {
        super();
    }

    public Birds(String pid, String pt, String b, String d, String pr) {
        super(pid, pt, b, d, pr);
    }

    public Birds(String pid, String pt, String b, String d, String pr, String bp, String bd) {
        super(pid, pt, b, d, pr);
        this.birdDesc = bd;
        this.birdPrice = bp;
    }

    public String getBirdPrice() {
        return birdPrice;
    }

    public void setBirdPrice(String birdPrice) {
        this.birdPrice = birdPrice;
    }

    public String getBirdDesc() {
        return birdDesc;
    }

    public void setBirdDesc(String birdDesc) {
        this.birdDesc = birdDesc;
    }

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price Range of Bird:");
        birdPrice = sc.next();
    }

    @Override
    public String finalPrice() {
        return birdPrice;
    }

    @Override
    public void getDesc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Description of Bird:");
        birdDesc = sc.next();
    }

	@Override
	public String finalDesc() {
		// TODO Auto-generated method stub
		return  birdDesc;
	}


}
