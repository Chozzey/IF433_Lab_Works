package oop_135062_dianfajrina.week11

package oop_NIM_NAMA.week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)

fun SmartDevice.diagnose(): String {
    return "[DIAGNOSTIK] $name | Kategori: $category | Status: ${
        if (isOnline) "Online" else "Offline"
    } | Daya: $powerLoad Watt"
}