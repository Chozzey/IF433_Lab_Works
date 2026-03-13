package oop_135062_dianfajrina.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    // Pengujian dari latihan terbimbing
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    // Tugas Smart Home
    val lamp = SmartLamp("L001", "Ruang Tamu")
    val speaker = SmartSpeaker("S001", "Google Nest Dapur")
    val cctv = SmartCCTV("C001", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n=== SMART HOME TESTING ===")
    println("-> Mengaktifkan Security Mode:")
    hub.activateSecurityMode()

    println("\n-> Mematikan semua switchable:")
    hub.turnOffAllSwitches()
}