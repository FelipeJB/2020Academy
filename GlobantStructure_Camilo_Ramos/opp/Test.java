package org.globant.opp;

public class Test {

	public static void main(String[] args) {
		
		
		
		GloberTD gTD = new GloberTD("Andres",32,5,"Technical Director",10000,"Not assigned");
		GloberDev gDEV = new GloberDev("Juan",27,2,"Semi senior",7000,"Assigned");
		GloberQC gQC = new GloberQC("Felipe",30,3,"Semi senior advance",6000,"Assigned");
		GloberDesigner gDes = new GloberDesigner("Andrea",26,3,"Senior",9000,"Not Assigned");

		gTD.wDescrtiption();
		gDEV.wDescrtiption();
		gQC.wDescrtiption();
		gDes.wDescrtiption();

	}

}
