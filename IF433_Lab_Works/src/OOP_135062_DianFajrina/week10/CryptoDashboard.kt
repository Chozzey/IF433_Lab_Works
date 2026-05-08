package oop_135062_dianfajrina.week10

fun main() {
    val coinRepo = WalletRepository<Coin>() [cite: 122, 123]
    coinRepo.add(Coin("BTC", 0.5)) [cite: 127]
    coinRepo.add(Coin("ETH", 2.0)) [cite: 127]
    coinRepo.add(Coin("USDT", 1000.0)) [cite: 127]
}