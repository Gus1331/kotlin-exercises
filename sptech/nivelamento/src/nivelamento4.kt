fun main() {

    lateinit var bairro:String
    // var cidade: String = null

    var cidade: String? = null
    println(cidade?: "ci    dade não informada")

    bairro = "chumbo"
    println("O bairro é $bairro")
}