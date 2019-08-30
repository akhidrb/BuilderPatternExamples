package com.cb.directors;

import com.cb.components.SSDHard;
import com.cb.components.ThirtyTwoRam;

public class ComputerBuilder {

	public Computer buildHPLaptop() {
		Computer computer = new Computer();
		computer.addComponent(new SSDHard());
		computer.addComponent(new ThirtyTwoRam());
		return computer;
	}
	
}
