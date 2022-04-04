class XMLRPCRequestBuilder {

    fun passingBuildGetRequest(): XMLRPCRequest {
        return XMLRPCRequest(object : Listener<Any> {
            override fun onResponse(obj: Any?) {

            }
        })
    }

    fun failingBuildGetRequest(): XMLRPCRequest {
        return XMLRPCRequest { obj: Any? ->
            
        }
    }
}
