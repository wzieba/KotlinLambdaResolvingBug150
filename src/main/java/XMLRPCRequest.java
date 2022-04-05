public class XMLRPCRequest {

    private final Listener<? super Object[]> listener;

    // The only possible values here are: Object or Object[]
    public XMLRPCRequest(Listener<? super Object[]> listener) {
        this.listener = listener;
    }

    public void deliverResponse(Object response) {
        deliverResponse(listener, response);
    }

    public <K> void deliverResponse(final Listener<K> listener, Object rawResponse) {
        K response = (K) rawResponse;
        listener.onResponse(response);
    }
}
