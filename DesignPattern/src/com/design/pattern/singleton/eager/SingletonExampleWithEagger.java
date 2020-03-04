package com.design.pattern.singleton.eager;

public class SingletonExampleWithEagger {
	
	public static void main(String[] arg) {
			EagerRegistry sm =  EagerRegistry.getInstance();
			EagerRegistry sm1 =  EagerRegistry.getInstance();
			
			System.out.println(sm==sm1);
	
	}
	
	

}
