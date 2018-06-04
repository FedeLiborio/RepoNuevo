package prueba2grailslibreria

import grails.gorm.services.Service

@Service(Libro)
interface LibroService {

    Libro get(Serializable id)

    List<Libro> list(Map args)

    Long count()

    void delete(Serializable id)

    Libro save(Libro libro)

}