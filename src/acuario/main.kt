package acuario

fun construirAcuario() {
    val acuario1 = Acuario()
    acuario1.imprimirTamano()
    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()
    val acuario3 = Acuario(alto = 35, largo =110)
    acuario3.imprimirTamano()
    val acuario4 = Acuario(ancho = 25, alto = 35, largo =110)
    acuario4.imprimirTamano()
    val acuario6 = Acuario(numeroDePeces = 29)
    val acuario7 = Acuario(numeroDePeces = 29)
    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    val miTorre = TanqueTorre(diametro= 25, alto= 45)
    acuario7.imprimirTamano()
    acuario7.volumen = 70
    acuario6.imprimirTamano()
    acuario7.imprimirTamano()
    acuario8.imprimirTamano()
    miTorre.imprimirTamano()

}

fun main() {
    construirAcuario()
}

