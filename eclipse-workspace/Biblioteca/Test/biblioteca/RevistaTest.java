package biblioteca;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RevistaTest {

	@Test
	public void testRevista() {
		Revista r1 = new Revista("r1", "r1", 1, 1);
		assertTrue(r1 instanceof Revista);
	}

}
