package main;

import trees.LockFreeBSTMap;

public class Main {
	
	public static void main(String[] args) {
		LockFreeBSTMap<Integer, String> bst = new LockFreeBSTMap<>();
		
		bst.put(1, "a");
		String val = bst.get(1);
		System.out.println(val);
		bst.remove(1);
		Boolean contains = bst.containsKey(1);
		System.out.println(contains);
	}

}
