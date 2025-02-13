fun main() {

    val frutas = listOf("abaca", "maca", "pera", "amora")

    println("fruta: ${frutas[1]}")
    println("fruta: ${frutas.first()}")
    println("fruta: ${frutas.last()}")

    val paises = mutableListOf("mexique", "argen", "chin")

    paises.add("groselha")

    paises.remove("groselha")
    paises.removeAt(0)
    println(paises)

    frutas.forEach{
        println("furta: $it")
    }

    paises.forEach { pais -> paises.remove(pais) }

    val frutaComR = frutas.find { it.contains("r")}

    val frutasComR = frutas.filter { it.contains("r")}

    println(frutasComR.count{it.length > 6})

    val frutasOrdenadas = frutas.sorted()

    for(x in 1..10){
        println(x)
    }

    for(x in 0..frutas.size -1){
        print("$x - ${frutas[x]}")
    }
}