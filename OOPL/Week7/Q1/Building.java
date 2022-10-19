package com.course.structure;
public class Building
{
	private int floors;
	private float sqfoots;
	public Building(float area, int floor)
	{
		floors=floor;
		sqfoots=area;
	}
	public float getArea()
	{
		return sqfoots;
	}
	public int getFloors()
	{
		return floors;
	}
}