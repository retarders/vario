package wtf.retarders.vario.parameter.converter;

public interface ParameterConverter<T> {

    /**
     * Converts a string to T
     *
     *
     * @param value the value of T as a string
     * @return the value converted to a T
     */
    T to(String value);

    /**
     * Converts a T to a string
     *
     *
     * @param value the T
     * @return the value converted to a String
     */
    String from(T value);

}
