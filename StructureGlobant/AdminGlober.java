package StructureGlobant;

import java.util.ArrayList;
import java.util.List;

public class AdminGlober {
	static List<Glober> myList = new ArrayList<Glober>();

	public void addGlober(Glober d) {
		myList.add(d);
	}

	public void showInformation() {
		for (Glober i : myList) {
			System.out.println(i.toString());
			System.out.println("Tasks = " + i.showTask() + "\n");

		}
	}

}