package main;

public class House {

	private String address;
	private int numPreviousOwners;
	private int numBedrooms;
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumPreviousOwners() {
		return numPreviousOwners;
	}

	public void setNumPreviousOwners(int numPreviousOwners) {
		this.numPreviousOwners = numPreviousOwners;
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public House() {
		
	}
	
	public House(String address, int numBedrooms) {
		this.address = address;
		this.numBedrooms = numBedrooms;
	}
	
	public House(String address, int numPreviousOwners, int numBedrooms) {
		this.address = address;
		this.numBedrooms = numBedrooms;
		this.numPreviousOwners = numPreviousOwners;
	}
	
	public String giveAddress() {
		return ("The address is: " + address);
	}
	
	public boolean hasPrevOwner(){
		if(numPreviousOwners <= 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void main(String[] args) {
//		House theFarm = new House("the farm", 0, 4);
//		
//		System.out.println(theFarm.numPreviousOwners);
//		System.out.println(theFarm.hasPrevOwner());
	}
	
	
}
