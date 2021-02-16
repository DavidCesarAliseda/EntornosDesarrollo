package biblioteca;
import static org.junit.Assert.*;
import org.junit.Test;

public class LibroTest {

	@Test
	public void testLibro() {
		Libro l1 = new Libro("l1", "l1", "l1");
		assertTrue(l1 instanceof Libro);
	}



}
