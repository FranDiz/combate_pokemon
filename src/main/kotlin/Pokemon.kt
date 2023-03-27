class Pokemon (nombre:String, lore:String, tipo:Tipo, vida:Int){
    var nombre=nombre
        get() {return field}
    var lore=lore
        get() {return field}
    var tipo=tipo
        get() {return field}
    var vida=vida
        get() {return field}
    fun recibirAtaque(ataque: Ataque) {
        val efectividad = tipo.verificarEfectividad(tipo.tipo, ataque.tipo.tipo)
        val danio = when {
            efectividad == 0.0 -> 0 // el ataque no tiene efecto
            efectividad == 0.5 -> ataque.danio / 2 // el ataque es poco efectivo
            efectividad == 2.0 -> ataque.danio * 2 // el ataque es súper efectivo
            else -> ataque.danio // el ataque tiene efecto normal
        }
        vida -= danio
    }
}