package kotlincollections

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
    )

//    val valorPedido = pedidos.getValue(4)
//    println(valorPedido)

    val message = pedidos.getOrElse(0) {
        "Não tem o pedido"
    }
    println(message)
    println(pedidos.getOrDefault(1, -1))
    println(pedidos.getOrDefault(0, -1))

    println(pedidos.keys)
    println(pedidos.values)

    for (numeroDePedido in pedidos.keys) {
        println("Pedido: $numeroDePedido")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50
    }

    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)

    println(pedidos + Pair(7, 90))
    println(pedidos)
    println(pedidos - listOf(6, 5))
    println(pedidos)

//    pedidos.putAll(setOf(7 to 90.0, 8 to 20.0))
    pedidos += setOf(7 to 90.0, 8 to 20.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("pedido $it")
    }

    for (p in pedidos) {
        println("número do pedido: ${p.key} \nvalor do pedido: ${p.value} ")
    }
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 50.0)
    println(pedidos)
}