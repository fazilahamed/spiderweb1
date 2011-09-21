package phase1;

import java.awt.Image;
import java.util.List;


public class SpiderPlot {
public static Image generate(List<Property> list){
		
		//TODO: Create the image from the properties in list
		
		//Divide the circle into N equal parts
		System.out.println("List is size: " + list.size());
		System.out.println("Degrees between lines: " + 360/list.size());

		//Draw one line per property
		int i = 0;
		for (Property prop : list){
			System.out.println("Property " + i + " = " + prop.toString() );
			i++;
		}
		
		return null;
	}

}
