import org.junit.Test

class XMLRPCRequestBuilderTest {

    //Note: they will both PASS in Kotlin below 1.5.0

    @Test
    fun testWithFailingBuildGetRequest() {
        XMLRPCRequestBuilder().failingBuildGetRequest().deliverResponse(
            emptyMap<String, String>()
        )
    }

    @Test
    fun testWithPassingBuildGetRequest() {
        XMLRPCRequestBuilder().passingBuildGetRequest().deliverResponse(
            emptyMap<String, String>()
        )
    }
}
