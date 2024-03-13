/**
 * Fecha
 *
 * @property dia
 * @property mes
 * @property a
 * @constructor Create empty Fecha
 */
class Fecha(private val dia: Int, private val mes: Int, private val anio: Int) {


    /**
     * Valida si la fecha representada por la instancia actual es válida.
     *
     *  @return retorna `true` si la fecha es válida, `false` de lo contrario.
     */
    fun esValida(): Boolean {
        var esValida = false

        if ((dia >= 1 || dia <= 31) && (mes >= 1 || mes <= 12)) {
            var diasMes = diasDelMes(mes)
            esValida = dia <= diasMes

        }

       return esValida
    }
    
    private fun esBisiesto(anio: Int):Boolean{
        return (anio % 400 == 0 || anio % 4 == 0 && anio % 100 != 0)
    }


    /**
     * Calcula la cantidad de días en el mes actual, considerando el año para febrero.
     *
     * @param diasMes
     * @return retorna `true` si el día actual es válido en el mes actual, `false` de lo contrario.
     */
    private fun diasDelMes(mes:Int):Int{
        var diasMes = 0
        when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> diasMes = 31
            4, 6, 9, 11 -> diasMes = 30
            2 -> diasMes = if (esBisiesto(anio)) 29 else 28
        }
        return diasMes
    }
}
