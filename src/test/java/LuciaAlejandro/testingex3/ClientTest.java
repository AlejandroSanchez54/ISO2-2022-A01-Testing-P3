package LuciaAlejandro.testingex3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClientTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before -> How many times do i appear?");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After -> How many times do i appear?");
	}

	@Test
	public void testGetAge() {
		Client c= new Client(18, true, true, true, true);
		assertEquals(18, c.getAge());
	}

	@Test
	public void testSetAge() {
		Client c= new Client(18, true, true, true, true);
		c.setAge(20);
		assertEquals(20, c.getAge());
		
		c.setAge(40);
		assertEquals(40, c.getAge());
		
	}

	@Test
	public void testGetStudies() {
		
		Client c= new Client(18, true, true, true, true);
		assertEquals(true, c.getStudies());
	}

	@Test
	public void testSetStudies() {
		Client c= new Client(18, true, true, true, true);
		c.setStudies(false);
		assertEquals(false, c.getStudies());
	}

	@Test
	public void testGetParentsHouse() {
		Client c= new Client(18, true, true, true, true);
		assertEquals(true, c.getParentsHouse());
	}

	@Test
	public void testSetParentsHouse() {
		Client c= new Client(18, true, true, true, true);
		c.setParentsHouse(false);
		assertEquals(false, c.getParentsHouse());
	}

	@Test
	public void testGetUniversity() {
		
		Client c= new Client(18, true, true, true, true);
		assertEquals(true, c.getUniversity());
		
	}

	@Test
	public void testSetUniversity() {
		Client c= new Client(18, true, true, true, true);
		c.setUniversity(false);
		assertEquals(false, c.getUniversity());
	}

	@Test
	public void testGetWork() {
		Client c= new Client(18, true, true, true, true);
		assertEquals(true, c.getWork());
	}

	@Test
	public void testSetWork() {
		Client c= new Client(18, true, true, true, true);
		c.setWork(false);
		assertEquals(false, c.getWork());
	}

}
