package prueba2grailslibreria

class Autor {
	String nombre
	String apellido
	static hasMany = [libros : Libro]

    static constraints = {
    }
}
