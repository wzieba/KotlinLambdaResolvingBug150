class XMLRPCRequestBuilder {

    fun passingBuildGetRequest(): XMLRPCRequest {
        return XMLRPCRequest(object : Listener<Any> {
            override fun onResponse(obj: Any?) {
                Map::class.java.cast(obj)?.let { println(it) }
            }
        })
    }

    fun failingBuildGetRequest(): XMLRPCRequest {
        return XMLRPCRequest { obj: Any? ->
            Map::class.java.cast(obj)?.let { println(it) }
        }
    }
}
