import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class FechaTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun valida() {
        val fecha = Fecha(15, 12, 2023)
        assertTrue (fecha.esValida())
    }


    @Test
    fun fechaInvalidaDia() {
        val fecha = Fecha(32, 5, 2022)
        assertFalse (fecha.esValida())
    }

    @Test
    fun fechaInvalidaMes() {
        val fecha = Fecha(12, 13, 2021)
        // Assert.assertFalse(fecha.valida())
        assertFalse (fecha.esValida())
    }

    @Test
    fun fechaInvalidaFebreroBisiesto() {
        val fecha = Fecha(29, 2, 2021)
        assertFalse (fecha.esValida())
        println("Fecha invalida")
        println(fecha.esValida())
    }

    @Test
    fun fechaValidaFebreroBisiesto() {
        val fecha = Fecha(29, 2, 2024)
        assertTrue (fecha.esValida())
        println("Fecha valida Bisiesto")
        println(fecha.esValida())
    }




}