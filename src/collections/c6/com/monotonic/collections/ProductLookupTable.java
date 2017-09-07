package collections.c6.com.monotonic.collections;

public interface ProductLookupTable
{
    Product lookupById(int id);

    void addProduct(Product productToAdd);

    void clear();
}
