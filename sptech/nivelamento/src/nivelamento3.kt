fun main() {
    println(if(true) "vdd" else "false")

    when(3){
        in -10..-1 -> println("negative")
        0 -> println("zero")
        1 -> println("one")
        2 -> println("two")
        else -> println("number")
    }
}