package com.design.pattern.singleton.lazy;

public class Client {
	
	public static void main(String[] arg) {
	
		LazyRegistryWithDCL dcl = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL dcl2 = LazyRegistryWithDCL.getInstance();
		
		System.out.println(dcl==dcl2);
		
	
	}

}
