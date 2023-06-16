package co.edu.org.cropscan.service.especificacion;

public class AndSpecification<T> extends CompositeSpecification<T> {
    ISpecification<T> left;
    ISpecification<T> rigth;
    public AndSpecification(ISpecification<T> left, ISpecification<T> right) {
        this.left = left;
        this.rigth = right;
    }
    @Override
    public boolean isSatisfyBy(T candidate) {
        return left.isSatisfyBy(candidate) && rigth.isSatisfyBy(candidate);
    }
}
