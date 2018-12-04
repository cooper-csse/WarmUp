

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@link DLL}.
 * 
 * @author Curt Clifton
 */
public class DLLTest {

	private DLL<String> empty;
	private DLL<String> forward;
	private DLL<String> reverse;

	/**
	 * Sets up some lists.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.empty = new DLL<String>();

		this.forward = new DLL<String>();
		this.forward.addLast("Rose");
		this.forward.addLast("Hulman");

		this.reverse = new DLL<String>();
		this.reverse.addFirst("Rose");
		this.reverse.addFirst("Hulman");
	}

	/**
	 * Test method for {@link list.DLL#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		assertTrue(this.empty.isEmpty());
		assertFalse(this.forward.isEmpty());
		this.forward.removeFirst();
		assertFalse(this.forward.isEmpty());
		this.forward.removeFirst();
		assertTrue(this.forward.isEmpty());
	}

	/**
	 * Test method for {@link list.DLL#toString()}.
	 */
	@Test
	public void testToString() {
		assertEquals("[]", this.empty.toString());
		assertEquals("[Rose,Hulman]", this.forward.toString());
		assertEquals("[Hulman,Rose]", this.reverse.toString());
	}

	/**
	 * Test method for {@link list.DLL#removeFirst()}.
	 */
	@Test
	public void testRemoveFirst1() {
		assertEquals("Rose", this.forward.removeFirst());
		assertEquals("[Hulman]", this.forward.toString());
	}

	/**
	 * Test method for {@link list.DLL#removeFirst()}.
	 */
	@Test
	public void testRemoveFirst2() {
		this.forward.removeFirst();
		assertEquals("Hulman", this.forward.removeFirst());
		assertEquals("[]", this.forward.toString());
	}

	/**
	 * Test method for {@link list.DLL#removeFirst()}.
	 */
	@Test
	public void testRemoveFirst3() {
		assertEquals("Hulman", this.reverse.removeFirst());
		assertEquals("[Rose]", this.reverse.toString());
	}

	/**
	 * Test method for {@link list.DLL#removeFirst()}.
	 */
	@Test
	public void testRemoveFirst4() {
		this.reverse.removeFirst();
		assertEquals("Rose", this.reverse.removeFirst());
		assertEquals("[]", this.reverse.toString());
	}

	/**
	 * Test method for {@link list.DLL#removeFirst()}.
	 */
	@Test(expected = NoSuchElementException.class)
	public void testRemoveFirst5() {
		this.empty.removeFirst();
	}

	/**
	 * Test method for {@link list.DLL#iterator()}.
	 */
	@Test(expected = NoSuchElementException.class)
	public void testIterator1() {
		DLLIterator<String> iter = this.empty.iterator();
		iter.next();
	}

	/**
	 * Test method for {@link list.DLL#iterator()}.
	 */
	@Test
	public void testIterator2() {
		DLLIterator<String> iter = this.empty.iterator();
		assertFalse(iter.hasNext());
		
		iter = this.forward.iterator();
		assertTrue(iter.hasNext());
		assertEquals("Rose", iter.next());
		assertEquals("Hulman", iter.next());
		assertFalse(iter.hasNext());
		
		iter = this.reverse.iterator();
		assertTrue(iter.hasNext());
		assertEquals("Hulman", iter.next());
		assertEquals("Rose", iter.next());
		assertFalse(iter.hasNext());
	}
}
