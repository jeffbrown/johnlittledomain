package gi.dam.desk.core

class User {
    String name
    String password

    static constraints = {
        password password: true
    }
}
