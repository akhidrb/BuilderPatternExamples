package com.cb;

import com.cb.directors.Computer;
import com.cb.directors.ComputerBuilder;

public class Main {

	public static void main(String[] args) {
		ComputerBuilder computerBuilder = new ComputerBuilder();
		
		Computer computer = computerBuilder.buildHPLaptop();
		System.out.println("HP Laptop:");
		computer.showComponents();
		System.out.println("Cost: " + computer.getCost());
	}

}
