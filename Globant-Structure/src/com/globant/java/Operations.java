package com.globant.java;

public class Operations extends Glober{

    protected String project;
    protected String bu;
    protected String studio;

    public void infoOperations (String project, String bu, String studio){
        this.project = project;
        this.bu = bu;
        this.studio = studio;
        System.out.println("  Operations Class Atributes:");
        System.out.println("   Project = " + project + ", BU = " + bu + ", Studio = " + studio);
    }
}
