class Fecha(private val dia: Int, private val mes: Int, private val a: Int) {


    fun valida(): Boolean {

        if (dia < 1 || dia > 31) return false
        if (mes < 1 || mes > 12) return false

        // determinamos la cantidad de días del mes:
       return diasMes()
    } // … más métodos

    private fun diasMes():Boolean{
        var diasdelMes = 0
        when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> diasdelMes = 31
            4, 6, 9, 11 -> diasdelMes = 30
            2 -> diasdelMes = if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) 29 else 28
        }
        return if (dia > diasdelMes) false else true
    }
}
