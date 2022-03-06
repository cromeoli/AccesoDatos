import org.junit.Before
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

var paco = Programador("Paco", 45, "Python")

internal class ProgramadorTest {


    @Before

    //assertTrue -> Test BOOLEANS
    //assertEquals

    @Test
    fun trabaja() {
        assertTrue(paco.trabaja2() == "Trabaja programando fuerte")
    }

    @Test
    fun conducir() {
    }

    @Test
    fun getlenguaje() {
    }

    @Test
    fun getLenguaje() {
    }
}