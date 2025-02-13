class ContaCorrente {
    lateinit var titular: String
    var saldo: Double = 0.0
    var bloqueada: Boolean = false

    fun depositar(valor: Double){
        saldo += valor
    }

    fun descrever() = "Conta de $titular tem R$$saldo de saldo"
}