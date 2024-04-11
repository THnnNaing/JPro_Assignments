package PetsAssignment;

public abstract class Pet {

	protected String petID;
	protected String petType;
	protected String breed;
	protected String description;
	protected String priceRange;
	
	public Pet() {
		
	}
	
	public Pet(String pid, String pt, String b, String d, String pr) {
		this.petID=pid;
		this.petType=pt;
		this.breed=b;
		this.description=d;
		this.priceRange=pr;
	}
	
	public String getPetID() {
		return petID;
	}

	public void setPetID(String petID) {
		this.petID = petID;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}
	
//	add new abstract method
	public abstract void getDesc();
	public abstract void getData();
	public abstract String finalDesc();
	public abstract String finalPrice();


}
