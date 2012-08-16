package me.codeaweso;

import org.junit.Test;

public class StringSwitchTest {

	private static final String NULL = null;

	@Test(expected=NullPointerException.class)
	public void testSwitchOnNullString() {
		getGreeting(NULL);
	}

	public String getGreeting(String string) {
		String greeting;
		switch (string) {
		case "hello":
			greeting = "hello";
			break;
		case "hi":
			greeting = "howdy";
			break;
		default:
			greeting = "unknown";
			break;
		}
		return greeting;
	}

}
