//7.	WAP to demonstrate how garbage collector work when any memory is not referenced by 
//string object.
package com.Yash.String_Program;

public class GarbageCollector {

	String st;

	public GarbageCollector(String st) {
		super();
		this.st = st;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Garbage collected");
	}

	public static void main(String[] args) {
		GarbageCollector gc = new GarbageCollector("yash");
		gc = null;
		System.gc();
	}
}
