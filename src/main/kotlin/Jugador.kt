class Jugador (pokemon: Pokemon) {
    init{
        val Charizard = Pokemon("Charmander", "Salamandra llameante", Fuego, 50, 300)
        val Blastoise = Pokemon("Blastoise", "Tortuga bombardera", Agua, 45, 350)
        val Agumon = Pokemon("Agumon", "Reptiliano trotamundos", Tierra, 60, 300)
        val Bulbasaur = Pokemon("Bulbasaur", "Planta infecciosa", Planta, 30, 200)
        var lista_pokemons = arrayOf<Pokemon>(Charizard, Blastoise, Agumon, Bulbasaur)
    }
}