# Simulador de combate Clases.Pokemon      Proyecto  UTs 5 y 6                    
*Realizado por Francisco Rodríguez Diz y Álvaro Ruiz Galvin, de 1DAW B IES Rafael Alberti*
![pikachu](https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/International_Pok%C3%A9mon_logo.svg/1200px-International_Pok%C3%A9mon_logo.svg.png)

### Este proyecto trata de simular un combate Clases.Pokemon entre 2 jugadores y con la posiblidad de elegir entre varios pokemons disponibles, cada uno con su selección única de ataques


## Estructura del proyecto

  - Clases:
    - Clase Clases.Pokemon: ` class Clases.Pokemon (nombre:String, lore:String, tipo:Clases.Tipo, vida:Int, ataques:Array<Clases.Ataque>) `
      Contiene los atributos de los Pokemons y una array que guarda objetos de tipo `Clases.Ataque`
      También dispone de la función `recibirAtaque`
      
    - Clase Clases.Tipo: ` class Clases.Tipo(tipo:String) `
      Contiene toda la información sobre las compatibilidades de tipos, y la función `comprobarEfectividad`, que devuelve
      le efectividad de un ataque a un pokemon en relación a ambos tipos, y se usa a la función `recibirAtaque`
      
    - Clase Clases.Ataque: `class Clases.Ataque(nombre:String,tipo:Clases.Tipo,danio:Int)
      Contiene los parámetros del ataque
      
    - Clase Clases.Jugador: `class Clases.Jugador (pokemon: Clases.Pokemon)`
      En la clase jugador se almacena el pokemon que va a usar
      
  - Main: Se hace la simulación del combate con 2 pokemons, pikachu y charmander, y muestra el desarrollo del combate.
