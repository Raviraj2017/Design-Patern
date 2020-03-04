package com.design.pattern.singleton.lazy;

public class LazyRegistryWithDCL {

	private LazyRegistryWithDCL(){
		System.out.println("Inside Lazy RegistryWithDCL");
		
	}
	
	private static volatile LazyRegistryWithDCL INSTANCE;
	
	public static   LazyRegistryWithDCL getInstance() {
		
		if(INSTANCE == null) {
			synchronized (LazyRegistryWithDCL.class) {
				if(INSTANCE == null) { //double check Locking
					INSTANCE = new LazyRegistryWithDCL();
				}				
			}			
		}		
		return INSTANCE;
	}
}
