fun main(args: Array<String>) {

    val impactrueno = Ataque("Impactrueno", Tipo("eléctrico"), 70)
    val llamarada = Ataque("Llamarada", Tipo("fuego"), 80)
    val cañon_agua = Ataque("Cañon de agua",Tipo("agua"), 60)
    val placaje = Ataque("Placaje", Tipo("lucha"), 50)
    val cola_ferrea = Ataque ("Cola férrea", Tipo("acero"), 70)
    val terremoto = Ataque ("Terremoto", Tipo("tierra"), 90)
    val latigo_cepa = Ataque("Látigo Cepa", Tipo("planta"), 80)
    val puño = Ataque("Puñetazo", Tipo("lucha"), 100)

    val charizard = Pokemon("Charmander", "Salamandra llameante", Tipo("fuego"),  300, arrayOf(impactrueno, llamarada, terremoto, cola_ferrea))
    val blastoise = Pokemon("Blastoise", "Tortuga bombardera", Tipo("agua"), 350, arrayOf(cañon_agua, placaje, terremoto, puño))
    val agumon = Pokemon("Agumon", "Reptiliano trotamundos", Tipo("tierra"), 300, arrayOf(puño, terremoto, llamarada, placaje))
    val bulbasaur = Pokemon("Bulbasaur", "Planta infecciosa", Tipo("planta"), 250, arrayOf(latigo_cepa, impactrueno, terremoto, cola_ferrea))
    val pikachu = Pokemon("Pikachu", "Rata eléctrica", Tipo("eléctrico"), 250, arrayOf(impactrueno, cola_ferrea, puño, placaje))





}