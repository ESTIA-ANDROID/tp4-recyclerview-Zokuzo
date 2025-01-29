package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User
import java.util.*

object FakeApiServiceGenerator {

    @JvmField
    var FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://ui-avatars.com/api/?name=Jake"),
        User("002", "Paul", "https://ui-avatars.com/api/?name=Paul"),
        User("003", "Phil", "https://ui-avatars.com/api/?name=Phil"),
        User("004", "Guillaume", "https://ui-avatars.com/api/?name=Guillaume"),
        User("005", "Francis", "https://ui-avatars.com/api/?name=Francis"),
        User("006", "George", "https://ui-avatars.com/api/?name=George"),
        User("007", "Louis", "https://ui-avatars.com/api/?name=Louis"),
        User("008", "Mateo", "https://ui-avatars.com/api/?name=Mateo"),
        User("009", "April", "https://ui-avatars.com/api/?name=April"),
        User("010", "Louise", "https://ui-avatars.com/api/?name=Louise"),
        User("011", "Elodie", "https://ui-avatars.com/api/?name=Elodie"),
        User("012", "Helene", "https://ui-avatars.com/api/?name=Helene"),
        User("013", "Fanny", "https://ui-avatars.com/api/?name=Fanny"),
        User("014", "Laura", "https://ui-avatars.com/api/?name=Laura"),
        User("015", "Gertrude", "https://ui-avatars.com/api/?name=Gertrude"),
        User("016", "Chloé", "https://ui-avatars.com/api/?name=Chloe"),
        User("017", "April", "https://ui-avatars.com/api/?name=April"),
        User("018", "Marie", "https://ui-avatars.com/api/?name=Marie"),
        User("019", "Henri", "https://ui-avatars.com/api/?name=Henri"),
        User("020", "Rémi", "https://ui-avatars.com/api/?name=Remi")
    )

    @JvmField
    var FAKE_USERS_RANDOM = Arrays.asList(
        User("021", "Lea", "https://ui-avatars.com/api/?name=Lea"),
        User("022", "Geoffrey", "https://ui-avatars.com/api/?name=Geoffrey"),
        User("023", "Simon", "https://ui-avatars.com/api/?name=Simon"),
        User("024", "André", "https://ui-avatars.com/api/?name=Andre"),
        User("025", "Leopold", "https://ui-avatars.com/api/?name=Leopold")
    )

}
