package com.design.pattern.singleton.eager;

public class EagerRegistry {
	
	private EagerRegistry() {
		
	}
	
private	static EagerRegistry singtonClass = new EagerRegistry();
	
	public static EagerRegistry getInstance() {
	//	SingtonClass singtonClass = new SingtonClass();
		
		return singtonClass;
	}

}
