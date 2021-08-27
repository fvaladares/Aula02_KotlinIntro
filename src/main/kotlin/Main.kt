open class FormaGeometrica

class Retangulo(var altura: Double, var largura: Double) : FormaGeometrica() {
    var perimetro = (altura + largura) * 2
}


fun diaDaSemana(dia: Int) =
    when (dia) {
        0 -> "Domingo"
        1 -> "Segunda"
        2 -> "Terça"
        else -> "Dia inexistente"
    }

//

/*
       /* */
 */

fun Maximo(valor1: Int, valor2: Int): Int {
    if (valor1 > valor2) {
        return valor1
    } else {
        return valor2
    }
}

fun Maximo2(valor1: Int, valor2: Int) =
    if (valor1 > valor2) valor1
    else valor2


fun soma(var1: Int, var2: Int): Int {
    return var1 + var2
}

// A expressão é o retorno da função
fun sub(var1: Int, var2: Int) = var1 - var2

fun imprimirSoma(par1: Int, par2: Int) {
    println("A soma de $par1 e $par2 é ${par1 + par2}")
}


fun main(args: Array<String>) {
    val primeiraVariavel: Double = 15.5 // variável imutável já inicializada.
    val segundaVariavel = 5 // Tipo inferido automáticamente. (Int)
    val terceiraVariavelImutavel: Int
    var variavelMutavel = 13
    var numero: Int?

    numero = null

    var b: Int = numero!!

    println(b + 1)


    terceiraVariavelImutavel = 50

    println("Hello World!")
    println("Segunda linha!!")
    print("Terceira linha\n")
    println(43)



    println("------------------")
//    println("40 + 20 = " + soma(40, 20))
    println("40 + 20 = ${soma(40, 20)}")

    //Argumentos nomeados
    println("40 - 20 = ${sub(var2 = 20, var1 = 40)}")
    println("Valor da terceiraVariavel $terceiraVariavelImutavel")


    imprimirSoma(10, 3)

    val retangulo = Retangulo(10.0, 2.0)
    println("Retangulo com dimensoes ${retangulo.altura} X ${retangulo.largura}")
    println("Perímetro do Retângulo = ${retangulo.perimetro}")
    println("O maior número entre 15 e 30 é: ${Maximo(15, 30)}")
    println("O maior número entre 15 e 30 é: ${Maximo2(15, 30)}")

    val frutas = listOf("maçã", "laranja", "pera", "uva")
    println("------------------")
    for (fruta in frutas) {
        println(fruta)
    }
    println("------------------")
    for (i in frutas.indices) {
        println("O item na posição $i é ${frutas[i]}")
    }

    println("------------------")

    var index = 0
    while (index < frutas.size) {
        println("O item na posição $index é ${frutas[index]}")
        index++
    }

    println("Hoje é ${diaDaSemana(0)}")


    // Try adding program arguments at Run/Debug configuration
//    println("Program arguments: ${args.joinToString()}")
}