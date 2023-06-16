
fun main() {
    println("Enter text:")
    val text = readlnOrNull()?.toString()
    if (text != null) {
        val vowels = "aeiou"
        var countVowels = 0
        for (char in text) {
            if (char.lowercaseChar() in vowels) countVowels++
        }
        println("There are $countVowels vowels in the text.")
    }
}