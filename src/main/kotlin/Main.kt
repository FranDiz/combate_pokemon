import Clases.Ataque
import Clases.Pokemon
import Clases.Tipo

/**

Clase principal que simula un combate Clases.Pokemon entre dos pokemons previamente creados.
 */
fun main(args: Array<String>) {
// Creamos los dos pokemons que van a pelear
        val pikachu = Pokemon("Pikachu", "Un Clases.Pokemon eléctrico muy conocido", Tipo("eléctrico"), 100, arrayOf(Ataque("Rayo", Tipo("eléctrico"), 20), Ataque("Impactrueno", Tipo("eléctrico"), 30), Ataque("Cola de hierro", Tipo("acero"), 10), Ataque("Bola voltio", Tipo("eléctrico"), 15)))
        val charmander = Pokemon("Charmander", "Un Clases.Pokemon de fuego muy carismático", Tipo("fuego"), 100, arrayOf(Ataque("Lanzallamas", Tipo("fuego"), 25), Ataque("Ascuas", Tipo("fuego"), 20), Ataque("Golpe roca", Tipo("roca"), 15), Ataque("Arañazo", Tipo("normal"), 10)))

// Mostramos la información de los dos pokemons
        println("El primer pokemon es ${pikachu.nombre} (${pikachu.lore}), tipo ${pikachu.tipo.tipo} con ${pikachu.vida} puntos de vida.")
        println("Este Clases.Pokemon conoce los siguientes ataques:")
        for (ataque in pikachu.ataques) {
            if (ataque != null) {
                println("- ${ataque.nombre} (${ataque.tipo.tipo}) con un daño de ${ataque.danio} puntos.")
            }
        }
        println()
        println("El segundo pokemon es ${charmander.nombre} (${charmander.lore}), tipo ${charmander.tipo.tipo} con ${charmander.vida} puntos de vida.")
        println("Este Clases.Pokemon conoce los siguientes ataques:")
        for (ataque in charmander.ataques) {
            if (ataque != null) {
                println("- ${ataque.nombre} (${ataque.tipo.tipo}) con un daño de ${ataque.danio} puntos.")
            }
        }
        println()

// Empezamos el combate
        var turno = 1
        while (pikachu.estaVivo() && charmander.estaVivo()) {
            println("Turno $turno:")
// El primer pokemon ataca al segundo
            println("${pikachu.nombre} ataca a ${charmander.nombre} con ${pikachu.ataques[0]!!.nombre}!")
            charmander.recibirAtaque(pikachu.ataques[0]!!)
            println("${charmander.nombre} tiene ${charmander.vida} puntos de vida.")
// Si el segundo pokemon sigue vivo, ataca al primero
            if (charmander.estaVivo()) {
                println("${charmander.nombre} ataca a ${pikachu.nombre} con ${charmander.ataques[0]!!.nombre}!")
                pikachu.recibirAtaque(charmander.ataques[0]!!)
                println("${pikachu.nombre} tiene ${pikachu.vida} puntos de vida.")
            }
            println()
            turno++
        }

// Mostramos el resultado del combate
        if (pikachu.estaVivo()) {
            println("${pikachu.nombre} ha ganado!")
        } else {
            println("${charmander.nombre}")



}
}