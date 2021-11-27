package hyx2021.com.sean.stream;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 2021-01-05
 */
@FunctionalInterface
public interface Converter<T,F> {
    T convert (F from);
}
