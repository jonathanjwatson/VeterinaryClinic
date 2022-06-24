package com.bowwowvet;

public class Animal {
	private Integer age;
	private String breed;
	private String size;
	private String sound;
	private Integer weight;
	
	
	public Animal(Integer age, String breed, String size, String sound, Integer weight) {
		super();
		this.age = age;
		this.breed = breed;
		this.size = size;
		this.sound = sound;
		this.weight = weight;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getSound() {
		return sound;
	}


	public void setSound(String sound) {
		this.sound = sound;
	}


	public Integer getWeight() {
		return weight;
	}


	public void setWeight(Integer weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Animal [age=" + age + ", breed=" + breed + ", size=" + size + ", sound=" + sound + ", weight=" + weight
				+ "]";
	}
	
	
	
	
}
