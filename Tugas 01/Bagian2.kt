class IndeksNilaiMatkul(private val nilaiAkhir: Int) {
    fun hitungIndeks(): String {
        return when {
            nilaiAkhir in 80..100 -> "A"
            nilaiAkhir in 70..79 -> "AB"
            nilaiAkhir in 60..69 -> "B"
            nilaiAkhir in 50..59 -> "BC"
            nilaiAkhir in 40..49 -> "C"
            nilaiAkhir in 30..39 -> "D"
            nilaiAkhir in 0..29 -> "E"
            else -> "Nilai di luar jangkauan"
        }
    }
}

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Nilai harus diisi")
        return
    }

    val nilaiAkhir = args[0].toIntOrNull()
    if (nilaiAkhir == null) {
        println("Nilai harus berupa angka")
        return
    }

    val indeksNilaiMatkul = IndeksNilaiMatkul(nilaiAkhir)
    println("Nilai akhir: $nilaiAkhir")
    println("Indeks: ${indeksNilaiMatkul.hitungIndeks()}")
}