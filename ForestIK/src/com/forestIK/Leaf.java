package com.forestIK;

public class Leaf
{
	float SizeLeaf;
	String FormLeaf;
	
	public Leaf(float SizeLeaf, String FormLeaf)
	{
		this.SizeLeaf = SizeLeaf;
		this.FormLeaf = FormLeaf;
		
	}
	
	void setSizeLeaf(float newSize)
	{
		this.SizeLeaf = newSize;
	}
	
	void setFormLeaf(String newForm)
	{
		this.FormLeaf = newForm;
	}
	
	float getsizeLeaf()
	{
		return SizeLeaf;
	}
	
	String getFormLeaf()
	{
		return FormLeaf;
	}
	
	void OutputLeaf()
	{
		System.out.println("Size Leaf= " + SizeLeaf);
		System.out.println("Form Leaf= " + FormLeaf);
	}
}
