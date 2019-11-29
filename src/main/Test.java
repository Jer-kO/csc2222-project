package main;

import trees.LockFreeBSTMap;

public class Test {
	
	public static void main2(String[] args) {
		LockFreeBSTMap<Integer, String> bst = new LockFreeBSTMap<>();
		
		bst.put(1, "a");
		String val = bst.get(1);
		System.out.println(val);
		bst.remove(1);
		Boolean contains = bst.containsKey(1);
		System.out.println(contains);
	}

}
