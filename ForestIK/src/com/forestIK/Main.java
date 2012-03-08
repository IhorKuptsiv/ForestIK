package com.forestIK;

public class Main
{
	
	public static void main(String[] args)
	{
		Ground ground = new Ground(8, "dark brown", "black soil");
		
		ConcreateLeaf concreateLeaf = new ConcreateLeaf(5, "Circle");
		System.out.println("properties Leaf");
		concreateLeaf.OutputEleaf();
		System.out.println();
		
		ConcreateTree concreateTree = new ConcreateTree(6, 4, "Lol", "Oak");
		System.out.println();
		
		System.out.println("LALLA");
		concreateTree.addLeaf();
		
		concreateTree.OutputTree();
		concreateTree.addTwoLeaf();
		concreateTree.OutputTree();
		concreateTree.deleteOneLeaf();
		concreateTree.OutputTree();
		concreateTree.removeAllLeaf();
		concreateTree.OutputTree();
		
		System.out.println();
		
		ground.addTwoTree();
		System.out.println("Ground");
		ground.OutputGround();
		ground.deleteOneTree();
		ground.OutputGround();
		ground.removeAllTree();
		ground.OutputGround();
		System.out.println();
	}
}
