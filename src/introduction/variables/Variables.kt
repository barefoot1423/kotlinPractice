package introduction.variables

fun main() {
    var a: String = "abc"
    println(a)

    val b: Int = 1
    var c = 1

    val d: Int

    if (someCondition()) {
        d = 1
    } else {
        d = 2
    }

    println(d)
}

fun someCondition(): Boolean {
    return false
}
