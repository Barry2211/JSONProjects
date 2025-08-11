package org.practice;

import java.util.ArrayList;
import java.util.List;

public class AdobeRoot {

	private String id;
	private String type;
	private String name;
	private String ppu;
	private Batters batters;
	private ArrayList<Topping> topping;
	
	public AdobeRoot(
			String id,
			String type,
			String name,
			String ppu,
			Batters batters,
			ArrayList<Topping> topping
			) {		
		this.id = id;
		this.type = type;
		this.name = name;
		this.ppu = ppu;
		this.batters = batters;
		this.topping = topping;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPpu() {
		return ppu;
	}
	public void setPpu(String ppu) {
		this.ppu = ppu;
	}
	public Batters getBatters() {
		return batters;
	}
	public void setBatters(Batters batters) {
		this.batters = batters;
	}
	public List<Topping> getTopping() {
		return topping;
	}
	public void setTopping(ArrayList<Topping> topping) {
		this.topping = topping;
	}
	
}
