fun passingRequest(): Request {
    val samListener = Listener<Any> { }
    return Request(samListener)
}

fun failingRequest(): Request {
    val lambdaListener: (Any) -> Unit = { obj: Any -> }
    return Request(lambdaListener)
}

fun passingKotlinRequest(): KotlinRequest {
    val samListener = Listener<Any?> { }
    return KotlinRequest(samListener)
}

fun failingKotlinRequest(): KotlinRequest {
    val lambdaListener: (Any) -> Unit = { obj: Any -> }
    return KotlinRequest(lambdaListener)
}
