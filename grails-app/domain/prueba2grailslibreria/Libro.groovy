package prueba2grailslibreria

class Libro {
	String nombre
	String isbn
	Integer paginas

	Genero genero

	static belongsTo = Autor
	static hasMany = [autores : Autor]
    static constraints = {
    	nombre(blank : false)
    	isbn(blanck : false)
    	paginas(blanck : false)
    }
}
