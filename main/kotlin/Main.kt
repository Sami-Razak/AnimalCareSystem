
interface Adoption {
    val days : Int
    val price : Double
    val benefits : List <String >
}

 class LimitedAdoption (
    override val days: Int,
    override val price: Double = 5.0 * days,
    override val benefits: List<String> = listOf("Besuchen des Tiers","Füttern des Tiers")
) : Adoption

 class UnlimitedAdoption (
     val adopter: String,
    override val days: Int = Int.MAX_VALUE,
    override val price: Double = 1000.00,
    override val benefits: List<String> = listOf("Besuchen der Tieres" ,"Füttern der Tiere","Streicheln der Tiere" ,"Gedenktafel mit dem Namen $adopter am Gehege")
) : Adoption



open class Animal (val species : String , val age : Int ) {
    var Patenschaften: MutableList<Adoption> = mutableListOf()

    open fun makeSound(): String {
        TODO()
    }

    open fun addAdoption(adoption: Adoption) {
        Patenschaften.add(adoption)

    }
fun showad (){
    for (adoption in Patenschaften){
        println("$adoption")
    }
}
    }


    open class Pet(
        species: String,
        age: Int,
        val owner: String,
        val name: String,
        wagsTail: Boolean,
    ) : Animal(species, age) {
        override fun makeSound(): String = ("$name sagt etwas")

    }

        class Bird(
            species: String,
            age: Int,
            val nocturnal: Boolean,
        ) : Animal(species, age) {
            override fun makeSound(): String = ("Amsel zwitschert")
        }


        class Cat(
            species: String,
            age: Int,
            owner: String,
            name: String,
            wagsTail: Boolean = true,
        ) : Pet(species, age, owner, name, wagsTail) {
            override fun makeSound(): String = ("$name sagt etwas. Miau")

            fun scratchFurniture(): String {
                return "$name kratzt an den Möbeln und ${makeSound()}"
            }

        }

        class Dog(
            species: String,
            age: Int,
            owner: String,
            name: String,
            val wagsTail: Boolean,
            // Patenschaften: MutableList<Adoption>,
        ) : Pet(species, age, owner, name, wagsTail) {

            override fun makeSound(): String = ("$name sagt etwas. Wuff")


            fun fetchToy(wagsTail: Boolean): String {
                val Tailm = if (wagsTail) "freut sich"
                else {
                    ("freut sich nicht")
                }
                return "$name holt das Spiel zurück und $Tailm"
            }

            }


        class Parrot(
            species: String,
            age: Int,
            val nocturnal: Boolean,
            val knownWords: List<String>,
            //Patenschaften: MutableList<Adoption>,
        ) : Animal(species, age) {
            override fun makeSound(): String {
                val words = knownWords.joinToString()
                return "$species ahmt Wörter nach : $words"
            }
        }


        class Owl(
            species: String,
            age: Int,
            nocturnal: Boolean,
            val prey: List<String>,
            //  Patenschaften: MutableList<Adoption>,
        ) : Animal(species, age) {

            fun flySilently(): String {
                return "$species fliegt lautlos"
            }

            fun hunts(): String {
                val Beute = prey.joinToString()
                return "$species fliegt lautlos und jagt $Beute"
            }


        }




