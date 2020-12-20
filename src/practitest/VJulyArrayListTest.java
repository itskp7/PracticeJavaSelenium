package practitest;

import java.util.ArrayList;

public class VJulyArrayListTest {

	public static void main(String[] args) {
		
		// ClassName  objName = new ClassName();   // see test1 class this is like object being created
		ArrayList<String> Krunal = new ArrayList<String>();
		
		Krunal.add("Selenium");
		Krunal.add("QC");
		Krunal.add("Jira");
		Krunal.add("TestLink");
		Krunal.add("TestRail");
		
		System.out.println(Krunal.size());
		System.out.println(Krunal.get(0));
		System.out.println(Krunal.get(2));
		System.out.println(Krunal.get(4));
		
		//System.out.println(Krunal.get(5)); // will give "index out of bound exception" bcz uptil 4 index only
		
		// lets say wanna print all list values
		
		System.out.println("-------after this whole loop--------");
		
		/*for (int i=0; i<Krunal.size(); i++) {
			System.out.println(Krunal.get(i));
		}*/
		
		for (String KP : Krunal) {   ////SEE Why WebElement gives error//////////////////////////////////////
			System.out.println(KP);
		}
		
	}

}
