package Clases

/**
 * CLASE ATAQUE: La clase ataque serán los ataques que tendrá cada pokemon.
 *               Los ataques tendrán los siguientes características:
 *               @param nombre será el nombre del ataque.
 *               @param tipo será el tipo del ataque.
 *               @param danio será la cantidad de daño que hace el ataque.
 *
 */
class Ataque(nombre:String, tipo: Tipo, danio:Int) {
    var nombre=nombre
        get(){
            return field
        }
        set(value){
            field=value
        }
    var tipo=tipo
        get(){
            return field
        }
        set(value){
            field=value
        }
    var danio=danio
        get(){
            return field
        }
        set(value){
            field=value
        }

}