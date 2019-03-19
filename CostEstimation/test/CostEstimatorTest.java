import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Test class for EstimateCost
 * @author Shiksha
 *
 */
class CostEstimatorTest {

	@Test
	void testFindcost() {
		CostEstimator obj=new CostEstimator();
		assertEquals(300000.0,obj.findcost(0, 250, false));
		assertEquals(300000.0,obj.findcost(0, 250, true));
		assertEquals(525000.0,obj.findcost(1, 350, false));
		assertEquals(625000.0,obj.findcost(2, 250, true));
		assertEquals(250000.0,obj.findcost(2, 250, false));
	}

}
