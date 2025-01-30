package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User
import java.util.*

object FakeApiServiceGenerator {

    @JvmField
    var FAKE_USERS = mutableListOf(
        User(1, "Jake", "https://ui-avatars.com/api/?name=Jake",true),
        User(2, "Paul", "https://ui-avatars.com/api/?name=Paul",true),
        User(3, "Phil", "https://ui-avatars.com/api/?name=Phil",true),
        User(4, "Guillaume", "https://ui-avatars.com/api/?name=Guillaume",true),
        User(5, "Francis", "https://ui-avatars.com/api/?name=Francis",true),
        User(6, "George", "https://ui-avatars.com/api/?name=George",true),
        User(7, "Louis", "https://ui-avatars.com/api/?name=Louis",true),
        User(8, "Mateo", "https://ui-avatars.com/api/?name=Mateo",true),
        User(9, "April", "https://ui-avatars.com/api/?name=April",true),
        User(10, "Louise", "https://ui-avatars.com/api/?name=Louise",true),
        User(11, "Elodie", "https://ui-avatars.com/api/?name=Elodie",true),
        User(12, "Helene", "https://ui-avatars.com/api/?name=Helene",true),
        User(13, "Fanny", "https://ui-avatars.com/api/?name=Fanny",true),
        User(14, "Laura", "https://ui-avatars.com/api/?name=Laura",true),
        User(15, "Gertrude", "https://ui-avatars.com/api/?name=Gertrude",true),
        User(16, "Chloé", "https://ui-avatars.com/api/?name=Chloe",true),
        User(17, "April", "https://ui-avatars.com/api/?name=April",true),
        User(18, "Marie", "https://ui-avatars.com/api/?name=Marie",true),
        User(19, "Henri", "https://ui-avatars.com/api/?name=Henri",true),
        User(20, "Rémi", "https://ui-avatars.com/api/?name=Remi",true)
    )



    @JvmField
    var FAKE_USERS_RANDOM = Arrays.asList(
        User(21, "Lea", "https://ui-avatars.com/api/?name=Lea",true),
        User(22, "Geoffrey", "https://ui-avatars.com/api/?name=Geoffrey",true),
        User(23, "Simon", "https://ui-avatars.com/api/?name=Simon",true),
        User(24, "André", "https://ui-avatars.com/api/?name=Andre",true),
        User(25, "Leopold", "https://ui-avatars.com/api/?name=Leopold",true)
    )

}
