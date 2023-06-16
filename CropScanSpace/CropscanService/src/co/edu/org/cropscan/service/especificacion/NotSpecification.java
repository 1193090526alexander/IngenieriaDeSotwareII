package co.edu.org.cropscan.service.especificacion;

public class NotSpecification<T> extends CompositeSpecification<T> {
    ISpecification<T> other;
    public NotSpecification(ISpecification<T> other) {
        this.other = other;
    }
    @Override
    public boolean isSatisfyBy(T candidate) {
        return !other.isSatisfyBy(candidate);
    }
}
