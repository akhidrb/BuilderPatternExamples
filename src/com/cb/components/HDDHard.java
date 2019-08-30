package com.cb.components;

import com.cb.builders.Hard;

public class HDDHard extends Hard {

	@Override
	public String type() {
		return "Hard Drive";
	}

	@Override
	public Double price() {
		return 500.00;
	}

}
