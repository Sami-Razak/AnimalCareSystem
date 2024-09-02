import java.net.MalformedURLException

class Zoo {
    var Tiere = mutableListOf<Animal>()
    var Patenschaften: MutableList<Adoption> = mutableListOf()

    fun addAnimal(animal: Animal) {
        var addanimal = Tiere.joinToString()

    }

    fun remove(animal: Animal) {
        Tiere.remove(animal)
    }

    fun gettotaladoptionmoney(): Double {
        var totalmoney = 0.0
        for (animal in Tiere) {
            val adoptions = animal.Patenschaften
            for (adoption in Patenschaften) {
                totalmoney += adoption.price

            }

        }
        return totalmoney
    }

    fun getBirdsinZoo(): List<Bird> {
        val voegel: MutableList<Bird> = mutableListOf()

        for (animal in Tiere) {
            if (animal is Bird) {
                val countvoegel = voegel.joinToString()
            }
        }
        return voegel


    }

    fun getUNlimitedAdopters(): List<String> {

        var adopters = mutableListOf<String>()
        for (animal in Tiere) {
            val adoptions = animal.Patenschaften
            for (adoption in animal.Patenschaften) {
                if (adoption is UnlimitedAdoption) {
                    adopters.add(adoption.adopter)
                }


            }
        }
        return adopters
    }

  //  fun getNumberofGreetingparrots(words: List<String>): Int {
    //    var count = 0
      //  val greetings = mutableListOf("Hallo", "Moin", "Hi")
        //for (animal in Tiere) {
          //  if (animal is Parrot)
            //    for (word in animal.knownWords) {
              //      if (animal.knownWords.contains(greetings)) {
                //        count++

                    }


//        return count







