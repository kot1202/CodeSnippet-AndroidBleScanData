package p.a.ble

class ScanStruct internal constructor(
    private val _raw: ByteArray,
    private val _rawData: ByteArray,
    val rawLength: Byte,
    val rawType: Byte
) {

    val raw: ByteArray
        get() = _raw.copyOf()

    val rawData: ByteArray
        get() = _rawData.copyOf()

    val intLength: Int = rawLength.toUnsignedInt()

    val adType: AdType = AdType.from(rawType)

    fun toRawString(): String {
        return StringBuilder("ScanStruct (raw) { ")
            .append("length = ${rawLength}, type = ${rawType}, data = [${_rawData.joinToString()}]")
            .append("}")
            .toString()
    }

    override fun toString(): String {
        fun formatHex(value: Byte): String = String.format("%02X", value.toUnsignedInt())
        return StringBuilder("ScanStruct (format) { ")
            .append(
                "length = ${intLength}, type = ${formatHex(rawType)}($adType), data = [${
                    _rawData.joinToString {
                        formatHex(
                            it
                        )
                    }
                }]"
            )
            .append("}")
            .toString()
    }
}