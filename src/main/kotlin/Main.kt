fun main(args: Array<String>) {
    val charizard = Pokemon("Charmander", "Salamandra llameante", Tipo("fuego"),  300)
    val blastoise = Pokemon("Blastoise", "Tortuga bombardera", Tipo("agua"), 350)
    val agumon = Pokemon("Agumon", "Reptiliano trotamundos", Tipo("tierra"), 300)
    val bulbasaur = Pokemon("Bulbasaur", "Planta infecciosa", Tipo("planta"), 250)
    val pikachu = Pokemon("Pikachu", "Rata eléctrica", Tipo("eléctrico"), 250)

    val impactrueno = Ataque("Impactrueno", Tipo("eléctrico"), 70)
    val llamarada = Ataque("Llamarada", Tipo("fuego"), 80)
    val cañon_agua = Ataque("Cañon de agua",Tipo("agua"), 60)
    val placaje = Ataque("Placaje", Tipo("lucha"), 50)
    val cola_ferrea = Ataque ("Cola férrea", Tipo("acero"), 70)
    val terremoto = Ataque ("Terremoto", Tipo("tierra"), 90)
    val latigo_cepa = Ataque("Látigo Cepa", Tipo("planta"), 80)




}