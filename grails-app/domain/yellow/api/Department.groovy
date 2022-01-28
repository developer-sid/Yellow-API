package yellow.api

import grails.mongodb.*
import grails.persistence.*

@Entity
class Department implements MongoEntity {

    static mapWith = "mongo"

    String id
    String department
    String created_at

    static constraints = {
    }

    static mapping = {
        collection "departments"
        database "yellow_db"
    }
}
