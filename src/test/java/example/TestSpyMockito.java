package example;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class TestSpyMockito {

	@Test
	public void testSpy() {
		SpyMockitoExtented aSpy = (SpyMockitoExtented) Mockito.spy(new SpyMockitoExtented());
		((SpyMockito) Mockito.doReturn("A test").when(aSpy)).onlyDemonstration();
		((SpyMockito) Mockito.doReturn("Another test").when(aSpy)).onlyAnotherDemonstration();
		
		String phrase = aSpy.onlyMoreDemonstration();
		assertTrue(!phrase.isEmpty());
	}
}
