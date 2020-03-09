package com.aarti.creational.builderpattern;

public class Sony extends Company{

	public String pack() {
		
		return "Sony CD";
	}

	@Override
	public int price() {
		
		return 20;
	}

}
