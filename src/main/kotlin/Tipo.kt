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
}