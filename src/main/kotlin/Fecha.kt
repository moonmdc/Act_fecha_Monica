/**
 * Fecha
 *
 * @property dia
 * @property mes
 * @property a
 * @constructor Create empty Fecha
 */
class Fecha(private val dia: Int, private val mes: Int, private val a: Int) {


    /**
     * Valida si la fecha representada por la instancia actual es válida.
     *
     *  @return retorna `true` si la fecha es válida, `false` de lo contrario.
     */
    fun valida(): Boolean {

        if (dia < 1 || dia > 31) return false
        if (mes < 1 || mes > 12) return false

       return diasMes()
    }


    /**
     * Calcula la cantidad de días en el mes actual, considerando el año para febrero.
     *
     * @param diasdelMes
     * @return retorna `true` si el día actual es válido en el mes actual, `false` de lo contrario.
     */
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
