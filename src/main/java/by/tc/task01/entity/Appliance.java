package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class Appliance implements Serializable{
	private String name;
	
	public Appliance() {
		name = "";
	}
	
	public Appliance(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Appliance [name=" + name + "]";
	}
	
	
}
