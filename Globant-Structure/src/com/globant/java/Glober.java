package com.globant.java;

public class Glober{

    protected int id;
    protected String name;
    protected String lastName;
    protected double salary;
    protected String rol;

    public void info (String name, String lastName, String rol){
        this.name = name;
        this.lastName = lastName;
        this.rol = rol;
        System.out.println("  Basic Glober Superclass Atributes: ");
        System.out.println("   Name= " + name + ", Last name= " + lastName + ", Rol= " + rol);
    }

    public void info (int id, String name, String lastName, double salary, String rol){
        System.out.println("  All Glober Superclass Atributes: ");
        System.out.println("   ID = " + id + ", Name = " + name + ", Last name = " + lastName);
        System.out.println("   Salary = " + salary + ", Rol = " + rol);
    }

}
