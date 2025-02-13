class PersegiPanjang(private val panjang: Int, private val lebar: Int) {
    fun hitungLuas(): Int {
        return panjang * lebar
    }

    fun hitungKeliling(): Int {
        return 2 * (panjang + lebar)
    }
}

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Panjang dan lebar harus diisi")
        return
    }

    val panjang = args[0].toInt()
    val lebar = args[1].toInt()
    val persegiPanjang = PersegiPanjang(panjang, lebar)

    println("Panjang: $panjang")
    println("Lebar: $lebar")
    println("Luas: ${persegiPanjang.hitungLuas()}")
    println("Keliling: ${persegiPanjang.hitungKeliling()}")
}