//
//class CpfValidator {
//    val teste : String = "Alo"
//
//    //retorna o tipo é .map
//    val validType = teste.let {
//        when {
//            isCpfValid(it) -> ValidType.CPF
//            isCnpjValid(it) -> ValidType.CNPJ
//            isEmailValid(it) -> ValidType.EMAIL
//            else -> ValidType.NON_VALID
//        }
//    }
//
//
//    val snackBarString = validType.let {
//        when(it){
//            ValidType.CPF -> getCpfFormatado()
//            ValidType.CNPJ -> getCnpjFormatado()
//            ValidType.EMAIL -> it
//            else -> "" // null
//        }
//    }
//
//    //retorna o true false pro botão é um map
//    val isEnabled = validType.let { it != ValidType.NON_VALID }
//
//    fun getCpfFormatado(cpf: String)  {
//        val cpfFormated = cpf.substring(0, 3) + "." +
//                cpf.substring(3, 6) + "." +
//                cpf.substring(6, 9) + "-" +
//                cpf.substring(9, 11)
//        val a = "TIPO: CPF - VALOR: $cpfFormated"
//    }
//
//    fun getCnpjFormatado(cnpj: String) {
//        val cnpjFormated = cnpj.substring(0, 2) + "." +
//                cnpj.substring(2, 5) + "." +
//                cnpj.substring(5, 8) + "/" +
//                cnpj.substring(8, 12) + "-" +
//                cnpj.substring(12, 14)
//        val a = "TIPO: CNPJ - VALOR: $cnpjFormated"
//    }
//
//    fun isEmailValid(document: String) : Boolean {
////        return PatternsCompat.EMAIL_ADDRESS.matcher(document).matches()
//        return false
//    }
//
//    fun isCnpjValid(document: String) : Boolean {
//
//        if (document.isEmpty()) return false
//
//        val numbers = document.filter { it.isDigit() }.map {
//            it.toString().toInt()
//        }
//
//        if (numbers.size != 14) return false
//
//        if (numbers.all { it == numbers[0] }) return false
//
//        return true
//    }
//
//    fun isCpfValid(document: String) : Boolean {
//
//        if (document.isEmpty()) return false
//
//        val numbers = document.filter { it.isDigit() }.map {
//            it.toString().toInt()
//        }
//
//        if (numbers.size != 11) return false
//
//        if (numbers.all { it == numbers[0] }) return false
//
//        val dv1 = ((0..8).sumOf { (it + 1) * numbers[it] }).rem(11).let {
//            if (it >= 10) 0 else it
//        }
//
//        val dv2 = ((0..8).sumOf { it * numbers[it] }.let { (it + (dv1 * 9)).rem(11) }).let {
//            if (it >= 10) 0 else it
//        }
//
//        return numbers[9] == dv1 && numbers[10] == dv2
//    }
//}
//
//enum class ValidType {
//    CPF,
//    CNPJ,
//    EMAIL,
//    NON_VALID
//}