package com.cb.directors;

import java.util.ArrayList;
import java.util.List;
import com.cb.builders.Component;

public class Computer {

	private List<Component> components = new ArrayList<>();
	
	public void addComponent(Component component) {
		components.add(component);
	}
	
	public Double getCost() {
		double totalCost = 0.00;
		for (Component component: components) {
			totalCost += component.price();
		}
		return totalCost;
	}
	
	public void showComponents() {
		for (Component component: components) {
			System.out.print("Component: " + component.name());
			System.out.print(", Type: " + component.type());
			System.out.println(", Price: " + component.price());
		}
	}
	
}
