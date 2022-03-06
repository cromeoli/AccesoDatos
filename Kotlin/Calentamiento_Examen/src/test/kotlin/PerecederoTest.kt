import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PerecederoTest {
    val distintoproducto1 = Perecedero("Batido", 1f, 10)
    val distintoproducto2 = Perecedero("Batido", 1f, 5)
    val mismoproducto1 = Perecedero("Batido", 1f, 2)
    val mismoproducto2 = Perecedero("Batido", 1f, 2)

    @Test
    fun calcular() {
    }
    @Test
    //Comprueba si dos productos con fechas de caducidad distintas son efectivamente, distintos
    fun distintoProducto(){
        assertFalse(distintoproducto1.equals(distintoproducto2))
    }

    @Test
    //Comprueba si dos productos con los mismos DIASPARACADUCAR y datos IDENTICOS son iguales
    fun mismoProducto(){
        assertTrue(mismoproducto1.equals(mismoproducto2))
    }
}