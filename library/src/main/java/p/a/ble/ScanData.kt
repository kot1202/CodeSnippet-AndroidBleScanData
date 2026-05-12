package p.a.ble

import android.bluetooth.le.ScanRecord

class ScanData internal constructor(
    private val _raw: ByteArray,
    private val _significantPart: ByteArray,
    private val _nonSignificantPart: ByteArray,
    private val _scanStructs: List<ScanStruct>
) {

    val raw: ByteArray
        get() = _raw.copyOf()

    val significantPart: ByteArray
        get() = _significantPart.copyOf()

    val nonSignificantPart: ByteArray
        get() = _nonSignificantPart.copyOf()

    fun get(adType: AdType): List<ScanStruct> {
        return _scanStructs.filter { it.adType == adType }
    }

    fun toRawString(): String {
        return StringBuilder("ScanData (raw) { \n")
            .append("\traw = [${_raw.joinToString()}],\n")
            .append("\tsignificantPart = [${_significantPart.joinToString()}],\n")
            .append("\tnonSignificantPart = [${_nonSignificantPart.joinToString()}],\n")
            .append("\tscanStructs = [\n")
            .append(_scanStructs.joinToString(separator = ",\n") { "\t\t${it.toRawString()}" })
            .append("\n")
            .append("\t]\n")
            .append("}")
            .toString()
    }

    override fun toString(): String {
        fun formatHex(value: Byte): String = String.format("%02X", value.toUnsignedInt())

        val builder = StringBuilder("ScanData (format) { \n")
        builder.append("\t raw = [${_raw.joinToString { formatHex(it) }}], \n")
        builder.append("\t significantPart = [${_significantPart.joinToString { formatHex(it) }}], \n")
        builder.append("\t nonSignificantPart = [${_nonSignificantPart.joinToString { formatHex(it) }}], \n")
        builder.append("\t scanStructs = [\n")
            .append(_scanStructs.joinToString(separator = ",\n") { "\t\t${it}" })
            .append("\n")
            .append("\t]\n")
        builder.append("}")
        return builder.toString()
    }
}