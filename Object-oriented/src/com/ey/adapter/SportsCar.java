package com.ey.adapter;

public class SportsCar implements Turbo {

	private String name;
	private double topSpeed;

	public SportsCar(String name, int speed) {

		this.name = name;
		this.topSpeed = speed;

	}

	@Override

	public double getSpeed() {

		return topSpeed;
	}

	@Override

	public String toString() {

		return "SportsCar[Name: " + name + ",topSpeed: " + topSpeed + "]";

	}

}
