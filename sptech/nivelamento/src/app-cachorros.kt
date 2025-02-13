fun main() {
    val c1 = Cachorro("au", "auau", 200.0)
    val c2 = Cachorro(nome = "miau", raca   = "miaumiau", preco = 220.0)
    val c3 = Cachorro(nome = "miau", raca   = "miaumiau", preco = 220.0)

    println(c1)
    println(c2 == c3)
}