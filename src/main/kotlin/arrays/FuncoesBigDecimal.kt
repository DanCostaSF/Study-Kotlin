package arrays

import java.math.BigDecimal

fun main() {
    println(replaceChars("22222222222"))
    replaceChars("22222222222")
}

private fun replaceChars(cpf : String)  {
    val cpff = cpf.replace(".", "").replace("-", "")
        .replace("(", "").replace(")", "")
        .replace("/", "").replace(" ", "")
        .replace("*", "")

    println(cpff.toString())
}
//vararg é uma array na função
fun bigDecimalArrayOf(vararg valores: String) : Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

//extend function, reduce é usado para acumular o valor somando ou mutiplicando etc
fun Array<BigDecimal>.somatoria() : BigDecimal {
    return this.reduce { acumulator, valor ->
        acumulator + valor
    }
}

//calcula a média
fun Array<BigDecimal>.media() : BigDecimal {
    return if(this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}
