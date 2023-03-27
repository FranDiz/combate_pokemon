/**
 * La clase Tipo almacenará un único atributo llamado @param tipo para
 * usarse en las demás clases(pokemon y ataque) como un objeto independiente.
 */
class Tipo(tipo:String) {
    var tipo=tipo
        get(){
            return field
        }
        set(value){
            field=value
        }
    // Efectividades será un mapa donde estará cada tipo con el tipo o tipos contra
    //los que es efectivo.
    private val efectividades = mapOf(
        "fuego" to setOf("agua", "tierra", "roca"),
        "agua" to setOf("planta", "eléctrico"),
        "planta" to setOf("fuego", "hielo", "veneno", "volador", "bicho"),
        "eléctrico" to setOf("tierra"),
        "hielo" to setOf("fuego", "lucha", "roca", "acero"),
        "lucha" to setOf("psíquico", "volador", "hada"),
        "veneno" to setOf("tierra", "psíquico"),
        "psíquico" to setOf("bicho", "fantasma", "siniestro"),
        "roca" to setOf("agua", "planta", "lucha", "tierra", "acero"),
        "tierra" to setOf("agua", "planta", "hielo"),
        "volador" to setOf("eléctrico", "hielo", "roca"),
        "bicho" to setOf("fuego", "volador", "roca"),
        "fantasma" to setOf("fantasma", "siniestro"),
        "dragón" to setOf("dragón"),
        "siniestro" to setOf("lucha", "bicho", "hada"),
        "acero" to setOf("fuego", "lucha", "tierra")
    )
    // La función comprobarEfectividad() determina la efectividad de un ataque contra un tipo de Pokemon
    fun comprobarEfectividad(tipoAtaque: Tipo): String {
        // Se utiliza el mapa de efectividades de la clase Tipo para obtener los tipos contra los que el ataque es efectivo
        val tiposEfectivos = efectividades[tipoAtaque.tipo]
        // Si el tipo del Pokemon es efectivo contra el tipo del ataque, se devuelve "mitad" para indicar que el ataque es poco efectivo
        if (tiposEfectivos?.contains(tipo) == true) {
            return "mitad"
        }
        // Si el tipo del Pokemon no es efectivo contra el tipo del ataque, se devuelve "doble" para indicar que el ataque es muy efectivo
        if (tiposEfectivos?.contains(tipo) == false) {
            return "doble"
        }
        // Si el tipo del Pokemon no es ni efectivo ni no efectivo contra el tipo del ataque, se devuelve "normal" para indicar que el ataque no tiene efectividad especial
        return "normal"
    }
}