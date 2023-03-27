/**
 * clase Jugador: almacena los @param Pokemon y funciones para el main
 *
 */

class Jugador (pokemon: Pokemon) {
    val Charizard = Pokemon("Charmander", "Salamandra llameante", Tipo("fuego"),  300)
    val Blastoise = Pokemon("Blastoise", "Tortuga bombardera", Tipo("agua"), 350)
    val Agumon = Pokemon("Agumon", "Reptiliano trotamundos", Tipo("tierra"), 300)
    val Bulbasaur = Pokemon("Bulbasaur", "Planta infecciosa", Tipo("planta"), 200)
    var lista_pokemons = arrayOf<Pokemon>(Charizard, Blastoise, Agumon, Bulbasaur)
    var tu_pokemon=pokemon
    /**
     * elegirPokemon
     */
    fun elegirPokemon(){
        for (i in lista_pokemons){
            println("${i.nombre},${i.lore}\n")
            }
        println("Escribe el nombre de tu pokemon")
        var eleccion= readLine().toString()
        when(eleccion){
            "Charizard"-> tu_pokemon=Charizard
            "Blastoise"->tu_pokemon=Blastoise
            "Agumon"-> tu_pokemon=Agumon
            "Bulbasaur"->tu_pokemon=Bulbasaur
        }
        }
    }
