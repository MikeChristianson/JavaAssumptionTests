package net.christiansons.mike;

import static org.junit.Assert.assertNotSame;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests to check some assumptions that came up in a discussion about how Java 
 * handles parameter reassignment.
 */
public class ParameterReassignmentTest {
	
	private Object testObject;

	@Before
	public void setUp() {
		testObject = createNewObject();
	}

	@Test
	public void testParameterReassignedToNullIsUnaffected() {
		Object returned = assignParameterToNull(testObject);
		assertNotSame(testObject, returned);
	}
	
	@Test
	public void testParameterReassignedToNewObjectIsUnaffected() {
		Object returned = assignParameterToNewObject(testObject);
		assertNotSame(testObject, returned);
	}

	private Object assignParameterToNull(Object parameter) {
		parameter = null;
		return parameter;
	}

	private Object assignParameterToNewObject(Object parameter) {
		parameter = createNewObject();
		return parameter;
	}

	private Object createNewObject() {
		return new Object();
	}
}

