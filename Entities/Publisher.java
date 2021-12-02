package Entities;

import java.util.Objects;

public class Publisher {

	
	private int id;
	private String name;

	
	
	public Publisher() {
		
	}
	
	public Publisher(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Publisher(int id) {
		this(id , "Not Avabile");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
	
	
}
