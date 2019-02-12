// String (first letter uppercase) is a data type in Kotlin, it can be both escaped and raw text. Much like Python the
// escaped String uses both single quote and double quote.

val myBirthday = "Feb 11 1994"

// HOWEVER single quote in Kotlin is a Character!
//val myName = 'Adel' // Error because it is more than one character
val myNameFirstLetter = 'A'

// Raw text:
// Raw text in Kotlin doesn't escape any strings such as: \n, \t etc.

val RawText = """
    This is some Raw text\n
    Tabular format:
    1   2   3
    A   B   C
""".trimIndent()