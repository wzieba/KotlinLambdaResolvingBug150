import org.junit.Test
import java.util.Objects

class XMLRPCRequestBuilderTest {

    //Note: they will both PASS in Kotlin below 1.5.0
    @Test
    fun testWithFailingBuildGetRequest() {
        failingBuildGetRequest().deliverResponse(
            emptyMap<String, String>()
        )
    }

    @Test
    fun testWithPassingBuildGetRequest() {
        passingBuildGetRequest().deliverResponse(
            emptyMap<String, String>()
        )
    }

//    @Test
//    fun alwaysFailingNoMatterKotlinVersion() {
//        emptyMap<Object, Object>() as Array<Object>
//    }
}
