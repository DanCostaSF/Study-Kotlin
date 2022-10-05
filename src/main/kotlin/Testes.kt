//
//object Teste {
//    var cPF: String? = null
//
//    @JvmStatic
//    fun main(args: Array<String>) {
//        val cpf = "29292929292"
//        // 123.456.789-10
//        cPF =
//            cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11)
//        println("CPF:$cPF")
//    }
//
//    @JvmStatic
//    fun teste(args: Array<String>) {
//        val cpf = "29292929292222"
//        // 123.456.789-10
//        cPF =
//            cpf.substring(0, 2) + "." + cpf.substring(2, 5) + "." + cpf.substring(5, 8) + "/" + cpf.substring(8, 12) + "-" + cpf.substring(12, 14)
//        println("CNPJ:$cPF")
//    }
//
//    public static boolean isValid(String s)
//    {
//
//        // The given argument to compile() method
//        // is regular expression. With the help of
//        // regular expression we can validate mobile
//        // number.
//        // 1) Begins with 0 or 91
//        // 2) Then contains 7 or 8 or 9.
//        // 3) Then contains 9 digits
//        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
//
//        // Pattern class contains matcher() method
//        // to find matching between given number
//        // and regular expression
//        Matcher m = p.matcher(s);
//        return (m.find() && m.group().equals(s));
//    }
//
//// Driver code
//    public static void main(String[] args)
//    {
//        String s = "347873923408";
//
//        if (isValid(s))
//            System.out.println("Valid Number");
//        else
//            System.out.println("Invalid Number");
//    }
//}
//
//}