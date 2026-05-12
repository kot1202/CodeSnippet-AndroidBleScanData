package p.a.ble

import android.bluetooth.le.ScanRecord

internal fun Byte.toUnsignedInt(): Int = toUByte().toInt()
fun ScanRecord.toScanData(): ScanData = bytes.toScanData()
fun ByteArray.toScanData(): ScanData {
    val structs = mutableListOf<ScanStruct>()

    var index = 0
    while (index < this.size) {
        val rawLen = this[index]
        val len = rawLen.toUnsignedInt()
        if (len == 0) {
            break
        }

        val dataEndIndex = index + len + 1

        structs += ScanStruct(
            _raw = this.copyOfRange(index, dataEndIndex),
            _rawData = this.copyOfRange(index + 2, dataEndIndex),
            rawLength = rawLen,
            rawType = this[index + 1]
        )

        index = dataEndIndex
    }

    val significantPart = this.copyOfRange(0, index)
    val nonSignificantPart = this.copyOfRange(index, this.size)

    return ScanData(
        _raw = this,
        _significantPart = significantPart,
        _nonSignificantPart = nonSignificantPart,
        _scanStructs = structs
    )
}
