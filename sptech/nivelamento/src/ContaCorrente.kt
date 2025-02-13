class ContaCorrente {
    lateinit var titular: String
    var saldo: Double = 0.0
    var bloqueada: Boolean = false

    fun depositar(valor: Double){
        saldo += valor
    }

    fun descrever() = "Conta de $titular tem R$$saldo de saldo"

    fun mudarTitular(valorNovo: String): String{
        if(valorNovo != titular){
            var res: String = "$titular mudou pra $valorNovo"
            titular = valorNovo
            return res
        }
        return "Sem mudança de titular"
    }
}