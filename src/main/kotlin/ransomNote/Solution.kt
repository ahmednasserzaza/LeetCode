package ransomNote

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val freqs = mutableMapOf<Char, Int>()

    for (c in magazine) {
        if (c !in freqs) {
            freqs[c] = 0
        }

        freqs[c] = freqs[c]!! + 1
    }

    for (c in ransomNote) {
        if (c !in freqs) {
            return false
        }

        if (freqs[c]!! == 0) {
            return false
        }

        freqs[c] = freqs[c]!! - 1
    }

    return true
}
