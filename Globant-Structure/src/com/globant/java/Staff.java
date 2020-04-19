package com.globant.java;

public class Staff extends Glober{

    protected String site;

    public void infoStaff (String site){
        this.site = site;
        System.out.println("  Staff Class Atributes:");
        System.out.println("   Staff Info: Site = " + site);
    }
}
