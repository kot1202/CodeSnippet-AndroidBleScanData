package p.a.ble

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UnitTest {
    @Test
    fun test() {
        val data = byteArrayOf(
            0x02.toByte(), 0x01.toByte(), 0x06.toByte(), 0x1A.toByte(), 0xFF.toByte(), 0x4C.toByte(),
            0x00.toByte(), 0x02.toByte(), 0x15.toByte(), 0xE2.toByte(), 0x0A.toByte(), 0x0D.toByte(),
            0x0A.toByte(), 0x0D.toByte(), 0x0A.toByte(), 0x0D.toByte(), 0x0A.toByte(), 0x0D.toByte(),
            0x0A.toByte(), 0x0D.toByte(), 0x0A.toByte(), 0x0D.toByte(), 0x0A.toByte(), 0x0D.toByte(),
            0x0A.toByte(), 0x0D.toByte(), 0x0A.toByte(), 0x0D.toByte(), 0x0A.toByte(), 0x0D.toByte(),
        )

        val scanData = data.toScanData()
        // ====== toString
        println(scanData.toString())
        // ====== toRawString
        println(scanData.toRawString())

        val struct = scanData.get(AdType.MANUFACTURER_SPECIFIC_DATA).find { it.intLength == 9 }
    }
}