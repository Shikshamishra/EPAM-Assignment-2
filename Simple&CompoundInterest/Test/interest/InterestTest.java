package interest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import intrest.SimpleAndCompound;

class InterestTest {

	@Test
	void testCalSimpleInterest()
	{
		SimpleAndCompound obj = new SimpleAndCompound();
		
		assertEquals(1515.1500244140625,obj.calSimpleInterest(20202, 2.5f,3));
	}

	@Test
	void testCalCompoundInterest()
	{
		SimpleAndCompound obj=new SimpleAndCompound();
		
		assertEquals(21755.342888139312,obj.calCompoundInterest(20202, 2.5f,3));
	}

}
