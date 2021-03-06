public class Request {

    private final Listener<? super Object[]> listener;

    public Request(Listener<? super Object[]> listener) {
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
