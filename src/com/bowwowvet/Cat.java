package com.bowwowvet;

public class Cat extends Animal {

	public Cat(Integer age, String breed, String size, String sound, Integer weight) {
		super(age, breed, size, sound, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cat [age=" + this.getAge() + ", breed=" + this.getBreed() + ", size=" + this.getSize() + ", sound="
				+ this.getSound() + ", weight=" + this.getWeight() + "]";
	}

}
