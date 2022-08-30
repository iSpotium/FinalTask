package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance {
	private int powerConsumption;
	private int numberOfSpeakers;
	private String frequencyRange;
	private int cordLength;

	public Speakers() {
		powerConsumption = 0;
		numberOfSpeakers = 0;
		frequencyRange = "";
		cordLength = 0;
	}


	public Speakers(String name, int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
		super(name);
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
	}


	public int getPowerConsumption() {
		return powerConsumption;
	}


	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}


	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}


	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}


	public String getFrequencyRange() {
		return frequencyRange;
	}


	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}


	public int getCordLength() {
		return cordLength;
	}


	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cordLength, frequencyRange, numberOfSpeakers, powerConsumption);
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
		Speakers other = (Speakers) obj;
		return cordLength == other.cordLength && Objects.equals(frequencyRange, other.frequencyRange)
				&& numberOfSpeakers == other.numberOfSpeakers && powerConsumption == other.powerConsumption;
	}


	@Override
	public String toString() {
		return super.toString() + ", [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}
	
	
	
}
