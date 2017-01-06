import static org.junit.Assert.*;
import org.junit.Test;

public class TestCases {

	@Test
	public void test1() {
		assertEquals("1, 5 must return true", true, Solution.DoIt(1, 5));
	}

	@Test
    public void Test2() {
        assertEquals("5, 1 must return true", true, Solution.DoIt(5, 1));
    }

	@Test
	public void Test3() {
        assertEquals("2, 3 must return false", false, Solution.DoIt(2, 3));
    }

	@Test
	public void Test4() {
        assertEquals("3, 2 must return false", false, Solution.DoIt(2, 3));
    }

	@Test
	public void Test5() {
        assertEquals("-3, 4 must return true", true, Solution.DoIt(-3, 4));
    }

	@Test
	public void Test6() {
        assertEquals("4, -3 must return true", true, Solution.DoIt(-3, 4));
    }
}
