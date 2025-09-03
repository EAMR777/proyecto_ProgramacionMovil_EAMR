
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//proyecto_ProgramacionMovil_EAMR
    //Eduardo Agustin Morales Rojas
    println("Cantidad de valores")
    var n: Int = readln().toInt()
    for (i in 1..n) {
        println("Elemento $i")
    }

    println("Cantidad de valores")
    var n2: Int = readln().toInt()
    var con: Int = 1
    while (con <= n2) {
        println("Elemento $con")
        con++
    }

    // do-while
    con = 1
    do {
        println("Elemento $con")
        con++
    } while (con <= 5)

    // for
    for (i in n downTo 1) {
        println("Elemento $i")
    }


    val dias = arrayOf("Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo")
    for (dia in dias) {
        println(dia)
    }


    for (i in dias.indices) {
        println("Día ${i+1} es ${dias[i]}")
    }


    val f: Int = 10
    val q: Int = 5
    if (f > q) println("El valor de $f es mayor que el valor de $q")
    else println("El valor de $q es mayor que el valor de $f")

    val max = if (f > q) f else q
    println("El mayor es: $max")

    // when
    println("Introduzca un valor: ")
    val variable = readln().toInt()
    when (variable) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        in 4..12 -> println("Es otro mes")
        else -> println("No corresponde a un mes")
    }
}