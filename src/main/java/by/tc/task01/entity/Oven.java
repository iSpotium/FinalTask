package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance{
	private int powerConsumption;
	private int weight;
	private int capacity;
	private int depth;
	private double height;
	private double width;
	
	public Oven() {
		powerConsumption = 0;
		weight = 0;
		capacity = 0;
		depth = 0;
		height = 0;
		width = 0;

	}

	public Oven(String name, int powerConsumption, int weight, int capacity, int depth, int height, double width) {
		super(name);
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}

	
	public int getPowerConsumption() {
		return powerConsumption;
	}

	
	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	
	public int getWeight() {
		return weight;
	}

	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public int getDepth() {
		return depth;
	}

	
	public void setDepth(int depth) {
		this.depth = depth;
	}

	
	public double getHeight() {
		return height;
	}

	
	public void setHeight(double height) {
		this.height = height;
	}

	
	public double getWidth() {
		return width;
	}

	
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacity, depth, height, powerConsumption, weight, width);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oven other = (Oven) obj;
		return capacity == other.capacity && depth == other.depth
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& powerConsumption == other.powerConsumption && weight == other.weight
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() {
		return super.toString() + ", [powerConsumption=" + powerConsumption + ", weight=" + weight + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}

}
