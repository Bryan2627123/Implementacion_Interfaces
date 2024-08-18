package acuario

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El tiburón es de color: ${tiburon.color}")
    println("El pez payaso es de color: ${pezPayaso.color}")
}

fun main() {
    crearPeces()
}



