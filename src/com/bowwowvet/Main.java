package com.bowwowvet;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello!");

		Cat garfield = new Cat(10, "tabby", "large", "I hate Mondays!", 20);

		String sound = garfield.getSound();

		System.out.println(garfield.toString());
		System.out.println(sound);
	}
}
