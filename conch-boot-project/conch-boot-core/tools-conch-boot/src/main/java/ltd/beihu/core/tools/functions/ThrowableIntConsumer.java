package ltd.beihu.core.tools.functions;

/**
 * Represents an operation on {@code int}-valued input argument.
 *
 * @param <E> the type of the exception
 * @since 1.1.7
 * @see java.util.function.IntConsumer
 */
public interface ThrowableIntConsumer<E extends Throwable> {

    /**
     * Performs operation on the given argument.
     *
     * @param value  the input argument
     * @throws E an exception
     */
    void accept(int value) throws E;
}
