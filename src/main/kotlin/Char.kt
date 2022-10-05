import java.util.regex.Matcher
import java.util.regex.Pattern

internal object GFG {
    fun isValid(s: String?): Boolean {

        // The given argument to compile() method
        // is regular expression. With the help of
        // regular expression we can validate mobile
        // number.
        // 1) Begins with 0 or 91
        // 2) Then contains 7 or 8 or 9.
        // 3) Then contains 9 digits
        val p: Pattern = Pattern.compile("(0|91)?[7-9][0-9]{9}")

        // Pattern class contains matcher() method
        // to find matching between given number
        // and regular expression
        val m: Matcher = p.matcher(s)
        return m.find() && m.group().equals(s)
    }

    // Driver code
    @JvmStatic
    fun main(args: Array<String>) {
        val s = "27992425376"
        if (isValid(s)) println("Valid Number") else println("Invalid Number")
    }
}