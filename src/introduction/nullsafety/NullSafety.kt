package introduction.nullsafety

fun main() {
    var neverNull: String = "This can't be null"

//    neverNull = null  // When trying to assign null to non-nullable variable, a complication error is produced.

    var nullable: String? = "You can keep a null here"

    nullable = null

    print(nullable)

    println(describeString("as"))

}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}
