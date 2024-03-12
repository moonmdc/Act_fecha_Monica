class Fecha(private val d: Int, private val m: Int, private val a: Int) {


    fun valida(): Boolean {

        if (d < 1 || d > 31) return false
        if (m < 1 || m > 12) return false

        // determinamos la cantidad de días del mes:
       return diasMes()
    } // … más métodos

    private fun diasMes():Boolean{
        var diasdelMes = 0
        when (m) {
            1, 3, 5, 7, 8, 10, 12 -> diasdelMes = 31
            4, 6, 9, 11 -> diasdelMes = 30
            2 -> diasdelMes = if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) 29 else 28
        }
        return if (d > diasdelMes) false else true
    }
}
