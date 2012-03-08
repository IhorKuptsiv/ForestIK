package com.forestIK;

public class ConcreateLeaf extends Leaf

{
	private final String viewLeaf = "Klen";
	
	Leaf leafs = new Leaf(4, "Circle");
	
	public ConcreateLeaf(float SizeLeaf, String FormLeaf)
	{
		super(5, "Circle");
		
	}
	
	public void OutputEleaf()
	{
		System.out.println("Concreate Leaf= " + viewLeaf);
		
	}
	
}
