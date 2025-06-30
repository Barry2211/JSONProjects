package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException {
		File file = new File(
				"D:\\Eclipse\\eclipse\\bin\\ApiProjects\\"
				+ "src\\test\\resources\\JSONs\\sample.json"
				);
		FileReader fileReader = new FileReader(file);
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		
		JSONObject json = (JSONObject) parse;
		System.out.println(json.toString())
		;
		
	}
}
