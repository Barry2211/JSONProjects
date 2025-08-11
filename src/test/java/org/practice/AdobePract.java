package org.practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AdobePract {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		ArrayList<Topping> topping = new ArrayList<Topping>();
		topping.add(new Topping("5001","None"));
		topping.add(new Topping("5002","Glazed"));
		
		List<Batter> batter = new ArrayList<>();
		batter.add(new Batter("1001","Regular"));
		batter.add(new Batter("1002","Chocolate"));
		
		Batters batters = new Batters(batter);
		
		String id = "0001";
		String type = "Donut";
		String name = "Cake";
		String ppu = "0.55";
		
		AdobeRoot adobeRoot = new AdobeRoot(id, type, name, ppu, batters, topping);
		
		File location = new File("D:\\Eclipse\\eclipse\\bin\\ApiProjects\\src\\test\\resources\\JSONs\\AdobeJSON.json");
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(location, adobeRoot); 
	}
}
