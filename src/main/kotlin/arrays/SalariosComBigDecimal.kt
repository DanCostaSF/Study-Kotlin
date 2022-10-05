package arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
   //ideal usar isso pois o double tem problemas de arredondamento(no caso de dinheiro)
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()

    //a função map retorna uma List com as diferenças feitas dentro dos {}
    val salariosComAumento = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()

    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulator, salario ->
        acumulator + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println(gastoTotal)

    //sorted organiza a lista do menor para o maior e take pega os 3 primeiros sendo o last os ultimos(obvio)
    val mediaDosSalarios = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
   println(mediaDosSalarios)


}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }


