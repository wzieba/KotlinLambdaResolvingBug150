import org.junit.Test

class RequestBuilderTest {

    //Note: they will both PASS in Kotlin below 1.5.0
    @Test
    fun testWithFailingRequest() {
        passingRequest().deliverResponse(
            emptyMap<String, String>()
        )
    }

    @Test
    fun testWithPassingRequest() {
        failingRequest().deliverResponse(
            emptyMap<String, String>()
        )
    }
}
