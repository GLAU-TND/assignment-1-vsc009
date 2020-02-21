package src.adt;

public interface contact<E> {
    void add(E item);

    void delete(E item);

    int search(E item);

    void viewall();

}
