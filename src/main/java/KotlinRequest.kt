class KotlinRequest(private val listener: Listener<in Array<Any>>) {
    fun deliverResponse(response: Any) {
        deliverResponse(listener, response)
    }

    fun <K> deliverResponse(listener: Listener<K>, rawResponse: Any) {
        val response = rawResponse as K
        listener.onResponse(response)
    }
}