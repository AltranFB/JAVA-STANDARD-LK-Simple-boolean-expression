import static org.junit.Assert.*;
import org.junit.Test;

public class TestCases {
	@Test
	public void Test1() {
		assertEquals("1 in first place", true, Solution.Test(1, 5));
	}

	@Test
    public void Test2() {
		assertEquals("1 in second place", true, Solution.Test(2, 1));
    }

	@Test
	public void Test3() {
		assertEquals("1 everywhere", true, Solution.Test(1, 1));
    }

	@Test
	public void Test4() {
		assertEquals("Simple fail", false, Solution.Test(2, 3));
    }

	@Test
	public void Test5() {
		assertEquals("Simple fail (2)", false, Solution.Test(3, 2));
    }

	@Test
	public void Test6() {
		assertEquals("Sum is 1", true, Solution.Test(-3, 4));
    }

	@Test
	public void Test7() {
		assertEquals("Sum is 1 (2)", true, Solution.Test(4, -3));
    }
	
	@Test
	public void Test8() {
		assertEquals("One more fail", true, Solution.Test(0, 0));
    }}
