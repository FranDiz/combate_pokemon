class Pokemon (nombre:String, lore:String, tipo:Tipo, fuerza:Int, vida:Int){
    var nombre=nombre
    var lore=lore
    var tipo=tipo
    var fuerza=fuerza
    var vida=vida

    fun recibirAtaque(){
        this.vida-this.fuerza
    }
}