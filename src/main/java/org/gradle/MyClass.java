package org.gradle;

public class MyClass {

	public boolean doSomething() throws Exception {
		return true;
	}

	public Boolean doBuggy() {
		return null;
		// return true;
	}
}