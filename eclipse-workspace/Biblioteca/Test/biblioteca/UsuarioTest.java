package biblioteca;
import org.junit.Test;

import junit.framework.TestCase;

public class UsuarioTest extends TestCase{

	@Test
	public void testUsuario() {
		Usuario u1 = new Usuario("User1");
		assertTrue(u1 instanceof Usuario);
	}

	@Test
	public void testAlquilarPublicacion() {
		Usuario user = new Usuario("User");
		Publicacion p1 = new  Publicacion("p1", "p1");
		user.alquilarPublicacion(p1);
		assertEquals(p1.isAlquilado(), true);
	}

	@Test
	public void testDevolverPublicacion() {
		Usuario user = new Usuario("User");
		Publicacion p1 = new  Publicacion("p1", "p1");
		user.alquilarPublicacion(p1);
		user.devolverPublicacion(p1);
		assertEquals(p1.isAlquilado(), false);
	}

	
}
