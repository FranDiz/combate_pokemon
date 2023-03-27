/**
 * Clase Pokemon: Contiene la información de los pokemons
 * @param tipo es de la clase Tipo
 */

class Pokemon (nombre:String, lore:String, tipo:Tipo, vida:Int, ataques:Array<Ataque>){
    var nombre=nombre
    var lore=lore
    var tipo=tipo
    var vida=vida
    var ataques = arrayOfNulls<Ataque>(4)
    init {
        var ataques = this.ataques
    }
    // Esta función recibe un ataque y resta la vida del Pokemon de acuerdo a la efectividad del ataque
    fun recibirAtaque(ataque: Ataque) {
        // Primero, se usa el método comprobarEfectividad() de la clase Tipo para determinar la efectividad del ataque
        val efectividad = tipo.comprobarEfectividad(ataque.tipo)
        // Luego, se usa un when para determinar cuánto daño restar a la vida del Pokemon según la efectividad
        when (efectividad) {
            // Si la efectividad es "doble", se resta el doble del daño del ataque
            "doble" -> vida -= ataque.danio * 2
            // Si la efectividad es "mitad", se resta la mitad del daño del ataque
            "mitad" -> vida -= ataque.danio / 2
            // Si la efectividad es "normal", se resta el daño del ataque tal cual
            else -> vida -= ataque.danio
        }
    }
}