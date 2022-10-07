package com.example.liguedeprono

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "LIGUE DES PRONOS: Le Commencement :) \n " +
                "Je me rappellerai de vous quand je serai riche <3"
    }
}