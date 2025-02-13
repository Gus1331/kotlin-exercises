fun main() {

    lateinit var bairro:String
    // var cidade: String = null

    var cidade: String? = null
    println(cidade?: "cidade não informada")

    bairro = "chumbo"
    println("O bairro é $bairro")
}