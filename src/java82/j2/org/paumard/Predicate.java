package java82.j2.org.paumard;

/**
 *
 * @author José Paumard
 */
@FunctionalInterface
public interface Predicate<T> {

    public boolean test(T t);
    
    public default Predicate<T> and(Predicate<T> other) {
        return t -> test(t) && other.test(t) ;
    }
    
    public default Predicate<T> or(Predicate<T> other) {
        return t -> test(t) || other.test(t);
    }
    
    public static <U> Predicate<U> isEqualsTo(U u) {
        return s -> s.equals(u);
    }
}
