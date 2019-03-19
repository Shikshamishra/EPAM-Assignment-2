import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class CalculatorTest {
	

	@Test
	void testAdd() {
		Arithmetic obj=new Arithmetic();
		assertEquals(9.0,obj.Add(5.0, 4.0));
		
	}

	@Test
	void testMul() {
		Arithmetic obj=new Arithmetic();
		assertEquals(10.0,obj.Mul(5.0, 2.0));
		
	}

	@Test
	void testDiv() {
		Arithmetic obj=new Arithmetic();
		assertEquals(2.0,obj.Div(4.0, 2.0));
		
	}

}
