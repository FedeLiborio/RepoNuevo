package prueba2grailslibreria

class Autor {
	String nombre

	static hasMany = [libros : Libro]

    static constraints = {
    }
}
