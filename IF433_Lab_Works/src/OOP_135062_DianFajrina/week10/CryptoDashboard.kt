package oop_135062_dianfajrina.week10

fun main() {
    val coinRepo = WalletRepository<Coin>() [cite: 122, 123]

    coinRepo.add(Coin("BTC", 0.5)) [cite: 127]
    coinRepo.add(Coin("ETH", 2.0)) [cite: 127]
    coinRepo.add(Coin("USDT", 1000.0)) [cite: 127]

    val response = ApiResponse("200 OK", coinRepo.getAll()) [cite: 132]

    println("Status: ${response.status}") [cite: 136]
    response.data.forEach { coin -> [cite: 136]
        println("Coin: ${coin.name}, Balance: ${coin.balance}") [cite: 136]
    }
}