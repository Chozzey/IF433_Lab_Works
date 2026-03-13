package oop_135062_dianfajrina.week06

fun main() {

    val lamp = SmartLamp("1", "Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== Security Mode Aktif ===")
    hub.activateSecurityMode()

    println("\n=== Mematikan Semua Perangkat ===")
    hub.turnOffAllSwitches()
}