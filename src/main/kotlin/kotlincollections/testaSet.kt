package kotlincollections

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Julin")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Cleitin", "Julin")
//  val assistiramAmbos: Set<String> =  assistiramCursoAndroid + assistiramCursoKotlin

    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Xulin ")
    //usado para "retirar" dados iguais
    println(assistiramAmbos.distinct())

    //+
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    //-
    println(assistiramCursoKotlin subtract assistiramCursoAndroid)

    //comparação
    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())
}
