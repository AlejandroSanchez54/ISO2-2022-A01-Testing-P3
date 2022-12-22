package LuciaAlejandro.testingex3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PrincipalTest {
	

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

	@Test()
	public void testDetermineAccount() {
		Principal p = new Principal();		
		Account comfort = new Account("Comfort");
		Account come = new Account("Come on, you can");
		Account save = new Account("Save Now While You Can");
		Account jump = new Account("Jump out of the Nest");
		Account independent = new Account("Become independent, it's about time");
		Account adult = new Account("Welcome to Adult Life");
		
			
		Client c = new Client(17,true,true,false,false);
		assertEquals(comfort.getType(), p.determineAccount(c).getType());
			
		Client c2 = new Client(24,true,true,false,false);
		assertEquals(come.getType(), p.determineAccount(c2).getType());
			
		Client c3 = new Client(19,false,true,true,true);
		assertEquals(save.getType(), p.determineAccount(c3).getType());
			
		Client c4 = new Client(24,false,false,false,true);
		assertEquals(jump.getType(), p.determineAccount(c4).getType());
			
		Client c5 = new Client(26,false,true,true,true);
		assertEquals(independent.getType(), p.determineAccount(c5).getType());
			
		Client c6 = new Client(26,false,false,true,true);
		assertEquals(adult.getType(), p.determineAccount(c6).getType());
		
		Client c8 = new Client(0,true,false,true,true);
		assertNull( p.determineAccount(c8));
		
		Client c7 = new Client(-5,false,false,false,false);
		assertNull( p.determineAccount(c7));
		
	
	}

}
