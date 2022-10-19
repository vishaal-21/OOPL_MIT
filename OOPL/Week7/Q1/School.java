package com.course.structure;
public class School extends Building
{
	private int classroom;
	private String level;
	public School(int classes, String grade, float area, int floor)
	{		
		super(area,floor);
		classroom = classes;
		level=grade;
	}
	public void display()
	{
		System.out.println("\n\t-----SCHOOL------ ");
		System.out.println("\t"+classroom+" classes");
		System.out.println("\t"+level+" level");
        System.out.println("\t" + getArea()+" square ft.");
        System.out.println("\t" + getFloors()+" floors");
	}
}