
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

/**
 * Test cases.
 * 
 * @author Matt Boutell. Created March 29, 2014.
 */
public class PQArrayListMinTest {

	private static int points = 0; 
	
	/**
	 * Test method for {@link PQArrayListMin#insert(java.lang.Comparable)}.
	 */
	@Test
	public void testInsertAndSize() {
		PQArrayListMin<String> pq = new PQArrayListMin<String>();
		assertEquals(0, pq.size());
		pq.insert("this");
		assertEquals(1, pq.size());
		pq.insert("unit");
		assertEquals(2, pq.size());
		pq.insert("test");
		assertEquals(3, pq.size());
		pq.insert("isnt");
		assertEquals(4, pq.size());
		pq.insert("foolproof");
		assertEquals(5, pq.size());
		points += 2;
	}

	/**
	 * Test method for {@link PQArrayListMin#findMin()}.
	 */
	@Test
	public void testFindMinEmpty() {
		PQArrayListMin<Integer> pq = new PQArrayListMin<Integer>();
		assertNull(pq.findMin());
		points += 0;
	}

	/**
	 * Test method for {@link PQArrayListMin#findMin()}.
	 */
	@Test
	public void testFindMin() {
		PQArrayListMin<Integer> pq = new PQArrayListMin<Integer>();
		pq.insert(10);
		pq.insert(3);
		pq.insert(15);
		assertEquals(new Integer(3), pq.findMin());
		points += 1;
	}

	/**
	 * Test method for {@link PQArrayListMin#findMin()}.
	 */
	@Test
	public void testFindMinStrings() {
		PQArrayListMin<String> pq = new PQArrayListMin<String>();
		pq.insert("outstanding");
		pq.insert("work");
		pq.insert("on");
		pq.insert("this");
		pq.insert("test");
		assertEquals("on", pq.findMin());
		points += 1;
	}

	/**
	 * Test method for {@link PQArrayListMin#removeMin()}.
	 */
	@Test
	public void testRemoveMinEmpty() {
		PQArrayListMin<Integer> pq = new PQArrayListMin<Integer>();
		assertNull(pq.deleteMin());
		points += 0;
	}

	/**
	 * Test method for {@link PQArrayListMin#removeMin()}.
	 */
	@Test
	public void testRemoveMin() {
		PQArrayListMin<Integer> pq = new PQArrayListMin<Integer>();
		pq.insert(10);
		pq.insert(3);
		pq.insert(15);
		pq.insert(12);
		assertEquals(new Integer(3), pq.deleteMin());
		assertEquals(new Integer(10), pq.deleteMin());
		assertEquals(new Integer(12), pq.deleteMin());
		assertEquals(new Integer(15), pq.deleteMin());
		assertNull(pq.deleteMin());
		points += 2;
	}

	/**
	 * Test method for {@link PQArrayListMin#removeMin()}.
	 */
	@Test
	public void testRemoveMinStrings() {

		PQArrayListMin<String> pq = new PQArrayListMin<String>();
		pq.insert("outstanding");
		pq.insert("work");
		pq.insert("on");
		pq.insert("this");
		pq.insert("test");
		assertEquals("on", pq.deleteMin());
		assertEquals("outstanding", pq.deleteMin());
		assertEquals("test", pq.deleteMin());
		assertEquals("this", pq.deleteMin());
		assertEquals("work", pq.deleteMin());
		assertNull(pq.deleteMin());
		points += 2;
	}

	/**
	 * Test method for {@link PQArrayListMin#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		PQArrayListMin<Integer> pq = new PQArrayListMin<Integer>();
		assertTrue(pq.isEmpty());
		pq.insert(10);
		assertFalse(pq.isEmpty());
		points += 1;
	}

	/**
	 * Test method for {@link PQArrayListMin#clear()}.
	 */
	@Test
	public void testClear() {
		PQArrayListMin<Integer> pq = new PQArrayListMin<Integer>();
		pq.insert(10);
		pq.insert(3);
		pq.insert(15);
		pq.insert(12);
		pq.clear();
		assertEquals(0, pq.size());
		points += 1;
	}
	
	@AfterClass
	public static void displayPoints() {
		System.out.printf("PRIORITY QUEUE CORRECTNESS POINTS = %d of 10\n", points);
		System.out.printf("Efficency of 2 more points are for meeting efficiency requirements (checked manually)\n");
	}
}
