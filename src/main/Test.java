package main;

import trees.*;

public class Test {
	
	public static void main(String[] args) {
		KLazyBST<Integer, String> bst = new KLazyBST<>();
		
		bst.put(1, "a");
		String val = bst.get(1);
		System.out.println(val);
		bst.remove(1);
		Boolean contains = bst.containsKey(1);
		System.out.println(contains);
		bst.remove(1);
	}

}
