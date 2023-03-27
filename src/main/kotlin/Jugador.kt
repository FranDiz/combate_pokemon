class Jugador (pokemon: Pokemon) {
    init{
        val Charizard = Pokemon("Charmander", "Salamandra llameante", Tipo("fuego"), 50, 300)
        val Blastoise = Pokemon("Blastoise", "Tortuga bombardera", Tipo("agua"), 45, 350)
        val Agumon = Pokemon("Agumon", "Reptiliano trotamundos", Tipo("tierra"), 60, 300)
        val Bulbasaur = Pokemon("Bulbasaur", "Planta infecciosa", Tipo("planta"), 30, 200)
        var lista_pokemons = arrayOf<Pokemon>(Charizard, Blastoise, Agumon, Bulbasaur)
    }
}