package com.forestIK;

public class Ground
{
	private float area;
	private String colour;
	private String name;
	private Tree arr[] = new Tree[0];
	
	public Ground(float area, String colour, String name)
	{
		this.area = area;
		this.colour = colour;
		this.name = name;
	}
	
	public void setArea(float newArea)
	{
		this.area = newArea;
	}
	
	public void setColour(String newColour)
	{
		this.colour = newColour;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public float getArea()
	{
		return area;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void addTree()
	{
		Tree arr2[] = new Tree[arr.length + 1];
		for (int i = 0; i < arr.length; i++)
		{
			arr2[i] = arr[i];
		}
		arr = new Tree[arr2.length];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = arr2[i];
		}
		
		arr[arr.length - 1] = new Tree(1, 1, "nice", "Byk");
	}
	
	public void addTwoTree()
	{
		Tree arr2[] = new Tree[arr.length + 2];
		for (int i = 0; i < arr.length; i++)
		{
			arr2[i] = arr[i];
		}
		arr = new Tree[arr2.length];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = arr2[i];
		}
		
		arr[arr.length - 1] = new Tree(2, 3, "great", "oak");
	}
	
	public void deleteOneTree()
	{
		Tree arr2[] = new Tree[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++)
		{
			arr2[i] = arr[i];
		}
		arr = new Tree[arr2.length];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = arr2[i];
		}
		
	}
	
	public int getTreeCount()
	{
		return arr.length;
	}
	
	public void removeAllTree()
	{
		arr = new Tree[0];
	}
	
	public void OutputGround()
	{
		
		System.out.println("Ground Area= " + area);
		System.out.println("Ground Colour= " + colour);
		
		System.out.println("Name Ground= " + name);
		System.out.println("Add Tree = " + arr.length);
	}
}
