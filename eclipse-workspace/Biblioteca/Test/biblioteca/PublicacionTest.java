package biblioteca;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PublicacionTest {

	@Test
	public void testPublicacion() {
		Publicacion p1 = new Publicacion("l1", "l1");
		assertTrue(p1 instanceof Publicacion);
	}

}
