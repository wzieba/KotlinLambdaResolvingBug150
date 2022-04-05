fun failingRequest(): Request {
    val anonymousClassListener = Listener<Any> { }
    return Request(anonymousClassListener)
}

fun passingRequest(): Request {
    val lambdaListener: (Any) -> Unit = { obj: Any -> }
    return Request(lambdaListener)
}
