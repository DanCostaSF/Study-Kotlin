package classandheranca

import kotlin.math.sqrt
import kotlin.math.PI

abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean {
        return residents < capacity
    }

    fun getRoom() {
        if (capacity > residents) {
            residents++
            println("You got a room!")
        } else {
            println("Sorry, at capacity and no rooms left.")
        }
    }
    abstract fun floorArea(): Double
}

class SquareCabin(residents: Int, val lenght: Double) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
    override fun floorArea(): Double {
        return lenght * lenght
    }
}

open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
    override fun floorArea(): Double {
        return PI * radius * radius
    }

    fun calculateMaxCarpetLength(): Double {
        return sqrt(2.0) * radius
    }
}

class RoundTower(
    residents: Int,
    radius: Double,
    val floors: Int = 2
) : RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}

fun main() {
    val squareCabin = SquareCabin(6, 50.0)
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Floor area: ${floorArea()}")
    }

    val roundHut = RoundHut(3, 10.0)
    with(roundHut) {
        println("\nRound Hut\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Floor area: ${floorArea()}")
        println("Carpet Length: ${calculateMaxCarpetLength()}")
    }

    val roundTower = RoundTower(4, 15.5)
    with(roundTower) {
        println("\nRound Tower\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Floor area: ${floorArea()}")
        println("Carpet Length: ${calculateMaxCarpetLength()}")
    }
}