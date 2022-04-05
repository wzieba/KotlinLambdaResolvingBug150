fun passingBuildGetRequest(): XMLRPCRequest {
    val anonymousClassListener = Listener<Any> { }
    return XMLRPCRequest(anonymousClassListener)
}

fun failingBuildGetRequest(): XMLRPCRequest {
    val lambdaListener: (Any) -> Unit = { obj: Any -> }
    return XMLRPCRequest(lambdaListener)
}
