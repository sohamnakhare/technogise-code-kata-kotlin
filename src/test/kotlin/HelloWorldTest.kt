import kotlin.test.Test
import kotlin.test.assertEquals

internal class HelloWorldTest {

    private val helloWorld: HelloWorld = HelloWorld()

    @Test
    fun testSum() {
        val expected = "Hello"
        assertEquals(expected, helloWorld.sample())
    }
}