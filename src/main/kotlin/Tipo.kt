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
    /**
     * Comprueba la efectividad de un ataque de cierto tipo contra un Pokémon de cierto tipo.
     *vidad(tipoPokemon: String, tipoAtaque: String): Double {
    val debilidades
     * @param tipoPokemon el tipo del Pokémon
     * @param tipoAtaque el tipo del ataque
     * @return un valor numérico que indica la efectividad del ataque. Si es 0, el ataque no tiene efecto;
     *         si es 0.5, el ataque es poco efectivo; si es 1, el ataque tiene efecto normal;
     *         si es 2, el ataque es super efectivo.
     */
    fun verificarEfectividad = efectividades[tipoPokemon]?.intersect(efectividades[tipoAtaque] ?: emptySet())
        val fortalezas = efectividades[tipoPokemon]?.subtract(debilidades ?: emptySet())
        return when {
            debilidades?.isNotEmpty() == true -> 2.0 // el ataque es súper efectivo
            fortalezas?.isNotEmpty() == true -> 0.5 // el ataque es poco efectivo
            else -> 1.0 // el ataque tiene efecto normal
        }
    }
