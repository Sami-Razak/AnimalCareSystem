fun main () {

    val dog = Dog (" Golden Retriever ", 6 , " Anja ", " Emma ", true )
    dog. addAdoption ( UnlimitedAdoption (" Sandy "))

    val cat = Cat (" Britisch Kurzhaar ", 0, " Sascha ", " Lucy ")
    cat. addAdoption ( LimitedAdoption (60) )
    cat. addAdoption ( UnlimitedAdoption (" Sandy "))

    val bird = Bird (" Amsel ", 0, false )

    val owl = Owl (" Eule ", 5, true , listOf (" Maus ", " Maulwurf ") )

    val parrot = Parrot (" Blaupapagei ", 0, false , listOf (" Hallo ", " Guten Tag ", " Ich mag Pizza ", " Tschüß") )
    parrot . addAdoption ( UnlimitedAdoption (" Mario "))

            println ( parrot . makeSound () ) // Blaupapagei ahmt Wö rter nach : Hallo , Guten Tag , Ich mag Pizza , Tsch üß
            println ( cat . scratchFurniture () ) // Lucy kratzt an den Mö beln und sagt Lucy sagt etwas : Miau !
            println ( dog . fetchToy (false) ) // Emma bringt das Spielzeug zur ück und freut sich !
            println ( owl . flySilently () ) // Eule fliegt lautlos
            println ( owl . hunts () ) // Eule fliegt lautlos und jagt Maus , Maulwurf



    val zoo = Zoo ()
    zoo. addAnimal ( dog )
    zoo. addAnimal ( cat )
    zoo. addAnimal ( bird )
    zoo. addAnimal ( owl )
    zoo. addAnimal ( parrot )
    //println ( zoo . gettotaladoptionmoney () ) // 3300
    //println ( zoo . getBirdsinZoo () ) // Bird , Owl , Parrot
    //println ( zoo . getUNlimitedAdopters () ) // Sandy . Mario
    //println ( zoo . getNumberofGreetingparrots ( listOf (" Hallo ", " Guten Tag ")) ) // 1
   // println ( zoo .  () ) // Cat , Bird , Parrot

}



