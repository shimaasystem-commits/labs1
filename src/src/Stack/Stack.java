
package src.Stack;

public interface Stack<E> {
    public boolean isEmpty();
    public int size();
    public void push(E data);

    public default E top() {
        return getE();
    }

    static E getE() {
        return null;
    }


}
