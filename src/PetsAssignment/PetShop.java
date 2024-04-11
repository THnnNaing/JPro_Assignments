package PetsAssignment;
import java.util.Scanner;

public class PetShop {
	private Pet pet[];
	private final int size;
	private int currentSize =-1;
	
	public PetShop(int s) {
		size=s;
		pet=new Pet[size];
	}
	
//	Adding Pets Information Function
	public void addPet(Pet p) {
	    //full
	    Scanner sc = new Scanner(System.in);
	    if (currentSize >= size - 1)
	        System.out.println("Full of Pets");
	    else {
	        System.out.print("Enter Pet ID:");
	        p.setPetID(sc.next());
	        System.out.print("Enter Pet Type:");
	        p.setPetType(sc.next());
	        System.out.print("Enter Pet Species:");
	        p.setBreed(sc.next());
	        if (!(p instanceof Birds))
	            p.getDesc(); //based on each child 
	        if (!(p instanceof Birds))
	            p.getData(); //based on each child
	        if (p instanceof Birds)
	            p.getDesc(); //based on each child 
	        if (p instanceof Birds)
	            p.getData(); //based on each child
	        pet[++currentSize]=p;
	    }
	}
	
//	Adding Breeds Information Function
	public void addBreed(Pet p) {
	    Scanner sc = new Scanner(System.in);
	    if (currentSize >= size - 1)
	        System.out.println("Full of Pets");
	    else {
	        if (p instanceof CatBritishShortHair) {
	            CatBritishShortHair britishShortHair = (CatBritishShortHair) p;
	            System.out.print("Enter Pet ID:");
		        p.setPetID(sc.next());
		        System.out.print("Enter Pet Type:");
		        p.setPetType(sc.next());
		        System.out.print("Enter Pet Species:");
		        p.setBreed(sc.next());
	            britishShortHair.getDesc();
	            britishShortHair.getData();
	        }else if (p instanceof DogShiba) {
	            DogShiba shibaDog = (DogShiba) p;
	            System.out.print("Enter Pet ID:");
		        p.setPetID(sc.next());
		        System.out.print("Enter Pet Type:");
		        p.setPetType(sc.next());
		        System.out.print("Enter Pet Species:");
		        p.setBreed(sc.next());
	            shibaDog.getDesc();
	            shibaDog.getData();
	        }
	        pet[++currentSize]=p;
	    }
	}
	
//	Just A Header Showing Function
	public void showHeader() {
		System.out.println(String.format("%-10s %-20s %-20s %-20s %-20s","ID","PetType","Species","Description","PriceRange","Final Price"));
	}
	
//	Showing All Pet Function Including Breeds
	public void showAllPet() {
	    if (currentSize == -1) {
	        System.out.println("Empty Data");
	    } else {
	        for (int i = 0; i <= currentSize; i++) {
	            String description = pet[i].finalDesc();
	            String priceRange = pet[i].finalPrice();

	            System.out.println(String.format("%-10s %-20s %-20s %-20s %-20s", pet[i].getPetID(), pet[i].getPetType(), pet[i].getBreed(), description, priceRange));
	        }
	    }
	}

//	Star Line 
	public static void starLine(int n, char ch) {
		for (int i = 1; i <= n; i++) {
			System.out.print(ch);	
		}
		System.out.println();
	}
	
//	Main Menu
	public static void menu () {
		starLine(50,'-');
		System.out.println("Pet Management System");
		starLine(50,'-');
		System.out.println("1. Add New Pet Information");
		System.out.println("2. Show All Pet");
		System.out.println("3. Add New Species Information");
		System.out.println("4. Exit");
		starLine(50,'-');
		System.out.println("Choose (1-3):");
	}
	
//	Pet Option Menu
	public static void PetMenu () {
		starLine(30,'-');
		System.out.println("Choose PET Type");
		starLine(30,'-');
		System.out.println("1. Cats");
		System.out.println("2. Dogs");
		System.out.println("3. Birds");
		System.out.println("4. Fishes");
		System.out.println("5. Rabbits");
		starLine(30,'-');
		System.out.println("Choose (1-5):");
	}
	
//	Breed Option Menu
	public static void BreedMenu() {
		starLine(100,'-');
		System.out.println("Species Management System");
		starLine(100,'-');
		System.out.println("1. British ShortHair(Cats)");
		System.out.println("2. Shiba Inus(Dogs)");
		System.out.println("3. Exit");
		starLine(100,'-');
		System.out.println("Choose (1-3):");
	}
	
//	Function to Be Called in Main 
	public void PMS() {
		Scanner sc = new Scanner(System.in);
		int opt;
		menu();
		opt=sc.nextInt();
		switch(opt) {
		case 1:{
			int option;
			PetMenu();
			option=sc.nextInt();
			switch(option) {
			case 1:addPet(new Cats());break; 						
			case 2:addPet(new Dogs());break; 
			case 3:addPet(new Birds());break;
			case 4:addPet(new Fishes());break;
			case 5:addPet(new rabbit());break;
			default: System.out.println("Wrong option");
			}
		};break;
		case 2:{
			starLine(90,'-');
			showHeader();
			starLine(90,'-');
			showAllPet();
			starLine(90,'-');
		};break;
		case 3:
		    BreedMenu();
		    int op = sc.nextInt();
		    switch (op) {
		        case 1:addBreed(new CatBritishShortHair());break;
		        case 2:addBreed(new DogShiba());break;
		        default:System.out.println("Wrong option");
		    }break;
		case 4:System.exit(0);
		default: System.out.println("Wrong option");
		}
	}
}
