package main;

public class Pet {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String name;
	private int age;
	private String location;
	private String type;
	
	public Pet() {
		
	}
	
	public Pet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Pet rose = new Pet();
//		rose.setAge(12);
//		rose.setLocation("the farm");
//		rose.setName("rose");
//		rose.setType("dog");
//
//		
//		System.out.println(rose.age);
	}

}
