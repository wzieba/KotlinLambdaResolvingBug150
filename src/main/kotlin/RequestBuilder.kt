fun passingRequest(): Request {
    val samListener = Listener<Any> { }
    return Request(samListener)
}

fun failingRequest(): Request {
    val lambdaListener: (Any) -> Unit = { obj: Any -> }
    return Request(lambdaListener)
}
