class Jugador (pokemon: Pokemon) {
    val Charizard = Pokemon("Charmander", "Salamandra llameante", Tipo("fuego"),  300)
    val Blastoise = Pokemon("Blastoise", "Tortuga bombardera", Tipo("agua"), 350)
    val Agumon = Pokemon("Agumon", "Reptiliano trotamundos", Tipo("tierra"), 300)
    val Bulbasaur = Pokemon("Bulbasaur", "Planta infecciosa", Tipo("planta"), 200)
    var lista_pokemons = arrayOf<Pokemon>(Charizard, Blastoise, Agumon, Bulbasaur)
    fun elegirPokemon(){
        println("Elige tu pokemon: ${Charizard.nombre}, ${Blastoise.nombre}, ${Agumon.nombre}, ${Bulbasaur.nombre}")

    }
}