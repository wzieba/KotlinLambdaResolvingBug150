fun failingRequest(): Request {
    val samListener = Listener<Any> { }
    return Request(samListener)
}

fun passingRequest(): Request {
    val lambdaListener: (Any) -> Unit = { obj: Any -> }
    return Request(lambdaListener)
}
