fun passingBuildGetRequest(): XMLRPCRequest {
    val anonymousClassListener = object : Listener<Any> {
        override fun onResponse(obj: Any) {

        }
    }
    return XMLRPCRequest(anonymousClassListener)
}

fun failingBuildGetRequest(): XMLRPCRequest {
    val lambdaListener: (Any?) -> Unit = { obj: Any? ->

    }
    return XMLRPCRequest(lambdaListener)
}
