package com.forestIK;

public class ConcreateTree extends Tree

{
	private final String viewTree = "Oak";
	
	Tree tree = new Tree(7, 3, "Great", "Oak");
	
	public ConcreateTree(float height, float widthMax, String view, String name)
	{
		super(6, 4, "Lol", "Oak");
		
		tree.addLeaf();
	}
	
	public void OutputOak()
	{
		System.out.println("Oak tree = " + viewTree);
		System.out.println();
	}
}
