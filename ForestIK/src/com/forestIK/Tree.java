package com.forestIK;

public class Tree
{
	private float height;
	private float widthMax;
	private String view;
	private String name;
	private Leaf arr[] = new Leaf[0];
	
	public Tree(float height, float widthMax, String view, String name)
	{
		this.height = height;
		this.widthMax = widthMax;
		this.view = view;
		this.name = name;
	}
	
	public void setHeight(float newHeight)
	{
		this.height = newHeight;
	}
	
	public void setWidthMax(float newWidth)
	{
		this.widthMax = newWidth;
	}
	
	public void setView(String newView)
	{
		this.view = newView;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	public float getWidth()
	{
		return widthMax;
	}
	
	public String getView()
	{
		return view;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void addLeaf()
	{
		Leaf arr2[] = new Leaf[arr.length + 1];
		for (int i = 0; i < arr.length; i++)
		{
			arr2[i] = arr[i];
		}
		arr = new Leaf[arr2.length];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = arr2[i];
		}
		
		arr[arr.length - 1] = new Leaf(height, name);
	}
	
	public void addTwoLeaf()
	{
		Leaf arr2[] = new Leaf[arr.length + 2];
		for (int i = 0; i < arr.length; i++)
		{
			arr2[i] = arr[i];
		}
		arr = new Leaf[arr2.length];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = arr2[i];
		}
		
		arr[arr.length - 1] = new Leaf(height, name);
	}
	
	public void deleteOneLeaf()
	{
		Leaf arr2[] = new Leaf[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++)
		{
			arr2[i] = arr[i];
		}
		arr = new Leaf[arr2.length];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = arr2[i];
		}
		
	}
	
	public int getLeafCount()
	{
		return arr.length;
	}
	
	public void removeAllLeaf()
	{
		arr = new Leaf[0];
	}
	
	public void OutputTree()
	{
		
		System.out.println("Height Tree= " + height);
		System.out.println("Width Tree= " + widthMax);
		System.out.println("View Tree= " + view);
		System.out.println("Name Tree= " + name);
		System.out.println("Leaf count= " + arr.length);
	}
}