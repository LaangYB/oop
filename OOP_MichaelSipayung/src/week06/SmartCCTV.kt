package week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV [$name] (ID: $id) diaktifkan.")
        startRecord()
    }

    override fun turnOff() {
        stopRecord()
        println("CCTV [$name] sekarang dalam mode offline.")
    }

    override fun startRecord() {
        println("Sistem [$name]: Lensa aktif, mulai merekam aliran video ke penyimpanan...")
    }
}