package org.howard.edu.lsp.hw5;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class IntegerSetTest {
	IntegerSet set1 = new IntegerSet();
	IntegerSet set2 = new IntegerSet();

	
	

	
	@Before
    public void init() throws IntegerSetException { 
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);

		

		
    }

	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		// JUnit test case(s) for clear
		set2.clear();
		assertEquals(true, set1.isEmpty());
		
	}

	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		// JUnit test case(s) for length
		assertEquals(5, set2.length());
		
	}

	@Test
	@DisplayName("Test case for equals")
	public void testEqualsIntegerSet() {
		// JUnit test case(s) for equal
		assertEquals(false, set1.equals(set2));
	}

	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		// JUnit test case(s) for contains
		assertEquals(true, set2.contains(0));
	}

	@Test
	@DisplayName("Test case for largest")
	public void testLargest() throws IntegerSetException {
		// JUnit test case(s) for largest
		 assertEquals(5,set2.largest());
	}

	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws IntegerSetException {
		// JUnit test case(s) for smallest
		assertEquals(1,set1.smallest());
	}

	@Test
	@DisplayName("Test case for add")
	public void testAdd() throws IntegerSetException {
		// JUnit test case(s) for addition
		set2.add(6);
        assertEquals(4, set2.length());
		
	}

	@Test
	@DisplayName("Test case for remove")
	public void testRemove() throws IntegerSetException {
		// JUnit test case(s) for removal
		set1.remove(3);
        assertEquals(2, set1.length());
	}

	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		// JUnit test case(s) for union
		set1.union(set2);
		assertEquals(3,set1.List.get(1));
		assertEquals(4,set1.List.get(2));
		assertEquals(5,set1.List.get(3));

	}

	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect() {
		// JUnit test case(s) for intersection
		set1.intersect(set2);
		assertEquals(3,set1.List.get(1));
		assertEquals(2,set1.List.get(3));		
		
	}
	

	@Test
	@DisplayName("Test case for differences")
	public void testDiff() {
		// JUnit test case(s) for difference
		set2.diff(set1);
		assertEquals(3,set2.List.get(1));
		assertEquals(5,set2.List.get(2));
		
	} 
	
	@Test
	@DisplayName("Test case for isempity")
	public void testIsEmpty() {
		// JUnit test case(s) for emptiness
		assertEquals(false,set2.isEmpty());
	}

	@Test
	@DisplayName("Test case for String")
	public void testToString() {
		// JUnit test case(s) for string
		assertEquals("[100]",set1.toString());
	}
	
	}