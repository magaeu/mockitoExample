package example;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class TestMockitoExample {
	
	@Test
	public void testSameValues() {
		Iterator it = mock(Iterator.class);
		when(it.next()).thenReturn("Mockito").thenReturn("Example");
		
		String phrase = it.next() + " " + it.next();
		
		assertEquals("Mockito Example", phrase);
	}

}
