package biblioteca;

public class Test {
	public static void main(String[] args) {
		//Crear usuario
		Usuario user1 = new Usuario("David");
		Usuario user2 = new Usuario("Pepe");
		System.out.println(user1.toString());
		System.out.println(user1.toString());
		//Crear libro
		Libro libro1 = new Libro("Lazarillo", "Planeta", "Anonimo");
		Libro libro2 = new Libro("Quijote", "Planeta", "Cervantes");
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		//Alquilar libro
		System.out.println(user1.alquilarPublicacion(libro1));
		//Devolver libro
		System.out.println(user1.devolverPublicacion(libro1));
	
		//Devolver libro no alquilado
		System.out.println(user2.devolverPublicacion(libro2));
		
		//Alquilar libro ya alquilado
		System.out.println(user1.alquilarPublicacion(libro1));
		
		
		Biblioteca b1 = new Biblioteca();
		b1.agregarPublicacion(libro2);
		b1.mostrarCatalogo();		
		
	}
}
