package com.course.structure;
public class House extends Building
{
	private int bedroom,bathroom;
	public House(int bed, int bath, float area, int floor)
	{
		super(area,floor);
		bedroom = bed;
		bathroom = bed;
	}
	public void display()
	{
		System.out.println("\n\t-----HOUSE----- ");
		System.out.println("\t"+bedroom+" bedroom");
		System.out.println("\t"+bathroom+" bathroom");
        System.out.println("\t" + getArea()+" square ft.");
        System.out.println("\t" + getFloors()+" floors");
	}
}