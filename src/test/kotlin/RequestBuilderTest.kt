import org.junit.Test

class RequestBuilderTest {

    //Note: they will both PASS in Kotlin below 1.5.0
    @Test
    fun testWithPassingRequest() {
        passingRequest().deliverResponse(
            emptyMap<String, String>()
        )
    }

    @Test
    fun testWithFailingRequest() {
        failingRequest().deliverResponse(
            emptyMap<String, String>()
        )
    }
}
